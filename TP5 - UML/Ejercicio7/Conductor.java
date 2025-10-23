/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Maximiliano
 */
public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getLicencia() { return this.licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    @Override
    public String toString() {
        return "Conductor(" + "nombre = " + nombre + ", " + "licencia = " + licencia + ")";
    }
}
