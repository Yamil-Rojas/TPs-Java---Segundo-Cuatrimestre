/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Maximiliano
 */
public class Usuario {
    private String nombre;
    private String dni;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return this.dni; }
    public void setDni(String dni) { this.dni = dni; }

    @Override
    public String toString() {
        return "Usuario(" + "nombre=" + nombre + ", " + "dni=" + dni + ")";
    }
}
