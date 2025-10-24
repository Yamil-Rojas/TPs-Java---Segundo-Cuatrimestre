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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public void listarProfesores() {
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        cursos.forEach(Curso::mostrarInfo);
    }

    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream().filter(c -> c.getCodigo().equalsIgnoreCase(codigo)).findFirst().orElse(null);
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso c : profesor.getCursos()) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    public void reporteCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }

}
