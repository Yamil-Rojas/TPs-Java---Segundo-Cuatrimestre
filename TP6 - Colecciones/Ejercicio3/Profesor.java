/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author Maximiliano
 */
public class Profesor {
    private String id, nombre, especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        cursos.remove(c);
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        cursos.forEach(c -> System.out.println("Curso: " + c.getCodigo() + " - " + c.getNombre()));
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + "), Cursos: " + cursos.size());
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

}
