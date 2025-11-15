/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entities.Pedido;
import entities.Envio;
import entities.EstadoPedido;
import entities.EmpresaEnvio;
import entities.TipoEnvio;
import entities.EstadoEnvio;
import service.PedidoService;
import service.EnvioService;

import java.time.LocalDate;
import java.util.Scanner;

public class AppMenu {

    private final PedidoService pedidoService = new PedidoService();
    private final EnvioService envioService = new EnvioService();
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Crear Pedido + Envio");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Listar Envios");
            System.out.println("4. Eliminar Pedido");
            System.out.println("5. Eliminar Envio");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> crearPedidoConEnvio();
                case 2 -> listarPedidos();
                case 3 -> listarEnvios();
                case 4 -> eliminarPedido();
                case 5 -> eliminarEnvio();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void crearPedidoConEnvio() {
        try {
            System.out.println("\n=== CREAR PEDIDO ===");
            Pedido pedido = new Pedido();
            System.out.print("Número de pedido: ");
            pedido.setNumero(scanner.nextLine());
            System.out.print("Fecha (YYYY-MM-DD): ");
            pedido.setFecha(LocalDate.parse(scanner.nextLine()));
            System.out.print("Nombre del cliente: ");
            pedido.setClienteNombre(scanner.nextLine());
            System.out.print("Total: ");
            pedido.setTotal(Double.parseDouble(scanner.nextLine()));
            System.out.print("Estado (NUEVO, FACTURADO, ENVIADO): ");
            pedido.setEstado(EstadoPedido.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("\n=== CREAR ENVÍO ===");
            Envio envio = new Envio();
            System.out.print("Tracking: ");
            envio.setTracking(scanner.nextLine());
            System.out.print("Empresa (ANDREANI, OCA, CORREO_ARG): ");
            envio.setEmpresa(EmpresaEnvio.valueOf(scanner.nextLine().toUpperCase()));
            System.out.print("Tipo (ESTANDAR, EXPRES): ");
            envio.setTipo(TipoEnvio.valueOf(scanner.nextLine().toUpperCase()));
            System.out.print("Costo: ");
            envio.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Fecha despacho (YYYY-MM-DD): ");
            envio.setFechaDespacho(LocalDate.parse(scanner.nextLine()));
            System.out.print("Fecha estimada de entrega (YYYY-MM-DD): ");
            envio.setFechaEstimada(LocalDate.parse(scanner.nextLine()));
            System.out.print("Estado (EN_PREPARACION, EN_TRANSITO, ENTREGADO): ");
            envio.setEstado(EstadoEnvio.valueOf(scanner.nextLine().toUpperCase()));

            pedidoService.crearPedidoConEnvio(pedido, envio);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void listarPedidos() {
        try {
            System.out.println("\n=== LISTA DE PEDIDOS ===");
            pedidoService.getAll().forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar pedidos: " + e.getMessage());
        }
    }

    private void listarEnvios() {
        try {
            System.out.println("\n=== LISTA DE ENVÍOS ===");
            envioService.getAll().forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar envíos: " + e.getMessage());
        }
    }

    private void eliminarPedido() {
        try {
            System.out.print("ID del pedido a eliminar: ");
            Long id = Long.parseLong(scanner.nextLine());
            pedidoService.eliminar(id);
            System.out.println("Pedido eliminado.");
        } catch (Exception e) {
            System.err.println("Error al eliminar pedido: " + e.getMessage());
        }
    }

    private void eliminarEnvio() {
        try {
            System.out.print("ID del envío a eliminar: ");
            Long id = Long.parseLong(scanner.nextLine());
            envioService.eliminar(id);
            System.out.println("Envío eliminado.");
        } catch (Exception e) {
            System.err.println("Error al eliminar envío: " + e.getMessage());
        }
    }
}