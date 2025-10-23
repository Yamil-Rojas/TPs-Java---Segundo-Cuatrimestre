/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.time.LocalDate;

/**
 *
 * @author Maximiliano
 */
public class TarjetaCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaCredito(String numero, LocalDate fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }

    public String getNumero() { return this.numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public LocalDate getFechaVencimiento() { return this.fechaVencimiento; }
    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public Cliente getCliente() { return this.cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Banco getBanco() { return this.banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    @Override
    public String toString() {
        return "TarjetaDeCredito(" + "numero=" + numero + ", " + "fechaVencimiento=" + fechaVencimiento + ", " + "cliente=" + cliente + ", " + "banco=" + banco + ")";
    }
}
