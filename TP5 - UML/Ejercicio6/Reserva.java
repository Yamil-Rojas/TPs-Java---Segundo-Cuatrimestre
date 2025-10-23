/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Maximiliano
 */
public class Reserva {
     private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public LocalDate getFecha() { return this.fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public LocalTime getHora() { return this.hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public Cliente getCliente() { return this.cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Mesa getMesa() { return this.mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    @Override
    public String toString() {
        return "Reserva(" + "fecha = " + fecha + ", " + "hora = " + hora + ", " + "cliente = " + cliente + ", " + "mesa = " + mesa + ")";
    }
}
