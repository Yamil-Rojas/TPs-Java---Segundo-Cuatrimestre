/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;

public class Pedido {
    private Long id;
    private Boolean eliminado;
    private String numero;
    private LocalDate fecha;
    private String clienteNombre;
    private double total;
    private EstadoPedido estado;
    private Envio envio; // Relación 1→1 unidireccional

    // Constructor vacío
    public Pedido() {
    }

    // Constructor completo
    public Pedido(Long id, Boolean eliminado, String numero, LocalDate fecha,
                  String clienteNombre, double total, EstadoPedido estado, Envio envio) {
        this.id = id;
        this.eliminado = eliminado;
        this.numero = numero;
        this.fecha = fecha;
        this.clienteNombre = clienteNombre;
        this.total = total;
        this.estado = estado;
        this.envio = envio;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    // toString legible
    @Override
    public String toString() {
        return "Pedido{" +
                " id= " + id +
                ", Número = '" + numero + '\'' +
                ", Fecha = " + fecha +
                ", Nombre Completo = '" + clienteNombre + '\'' +
                ", Total = " + total +
                ", Estado = " + estado +
                ", Envio = " + (envio != null ? envio.getId() : "No tiene") +
                '}';
    }
}