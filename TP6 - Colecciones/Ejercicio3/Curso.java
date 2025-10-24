/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Maximiliano
 */
public class Curso {
    private String codigo, nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
    if (this.profesor != null && this.profesor != nuevoProfesor) {
        Profesor anterior = this.profesor;
        this.profesor = null; // Evita recursión
        anterior.eliminarCurso(this);
    }

    this.profesor = nuevoProfesor;

    if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
        nuevoProfesor.agregarCurso(this);
    }
}

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Sin profesor asignado.");
        }
    }

}
