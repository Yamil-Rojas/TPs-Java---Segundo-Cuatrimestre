/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maximiliano
 */
import java.util.Arrays;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maximiliano");
        Producto p1 = new Producto("Celular", 2500);
        Producto p2 = new Producto("Auriculares", 800);
        Pedido pedido = new Pedido(Arrays.asList(p1, p2), cliente);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("En preparación");
    }
}