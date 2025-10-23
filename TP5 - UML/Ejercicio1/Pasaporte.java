package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Ejercicio1.Titular;
import Ejercicio1.Foto;
import java.time.*;
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
    }

    public String getNumero() { return this.numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public LocalDate getFechaEmision() { return this.fechaEmision; }
    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = fechaEmision; }
    public Foto getFoto() { return this.foto; }
    public void setFoto(Foto foto) { this.foto = foto; }
    public Titular getTitular() { return this.titular; }
    public void setTitular(Titular titular) { this.titular = titular; }

    @Override
    public String toString() {
        return "Pasaporte(" + "numero=" + numero + ", " + "fechaEmision=" + fechaEmision + ", " + "foto=" + foto + ", " + "titular=" + titular + ")";
    }
}
