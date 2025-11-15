/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;

public class Envio {
    private Long id;
    private Boolean eliminado;
    private String tracking;
    private EmpresaEnvio empresa;
    private TipoEnvio tipo;
    private double costo;
    private LocalDate fechaDespacho;
    private LocalDate fechaEstimada;
    private EstadoEnvio estado;

    // Constructor vacío
    public Envio() {
    }

    // Constructor completo
    public Envio(Long id, Boolean eliminado, String tracking, EmpresaEnvio empresa,
                 TipoEnvio tipo, double costo, LocalDate fechaDespacho,
                 LocalDate fechaEstimada, EstadoEnvio estado) {
        this.id = id;
        this.eliminado = eliminado;
        this.tracking = tracking;
        this.empresa = empresa;
        this.tipo = tipo;
        this.costo = costo;
        this.fechaDespacho = fechaDespacho;
        this.fechaEstimada = fechaEstimada;
        this.estado = estado;
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

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public EmpresaEnvio getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaEnvio empresa) {
        this.empresa = empresa;
    }

    public TipoEnvio getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnvio tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(LocalDate fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public LocalDate getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(LocalDate fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    // toString legible
    @Override
    public String toString() {
        return "Envio{" +
                " id=" + id +
                ", Tracking= '" + tracking + '\'' +
                ", Empresa= " + empresa +
                ", Tipo= " + tipo +
                ", Costo= " + costo +
                ", Fecha de despacho= " + fechaDespacho +
                ", Fecha estimada de entrega= " + fechaEstimada +
                ", Estado= " + estado +
                '}';
    }
}
