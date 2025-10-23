/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Maximiliano
 */
public class Cliente {
    private String nombre;
    private String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return this.dni; }
    public void setDni(String dni) { this.dni = dni; }

    @Override
    public String toString() {
        return "Cliente(" + "nombre = " + nombre + ", " + "dni = " + dni + ")";
    }
}
