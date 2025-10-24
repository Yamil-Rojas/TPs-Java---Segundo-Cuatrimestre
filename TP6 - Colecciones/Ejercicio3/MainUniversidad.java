/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Maximiliano
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P2", "Carlos Gómez", "Programación");
        Profesor p3 = new Profesor("P3", "Lucía Torres", "Física");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Java");
        Curso c3 = new Curso("C103", "Electromagnetismo");
        Curso c4 = new Curso("C104", "Scrum");
        Curso c5 = new Curso("C105", "Estadística");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C103", "P3");
        uni.asignarProfesorACurso("C104", "P2");
        uni.asignarProfesorACurso("C105", "P1");

        System.out.println("\nCursos:");
        uni.listarCursos();

        System.out.println("\nProfesores:");
        uni.listarProfesores();

        System.out.println("\nCambiar profesor de C104 a P3:");
        uni.asignarProfesorACurso("C104", "P3");

        System.out.println("\nEliminar curso C102:");
        uni.eliminarCurso("C102");

        System.out.println("\n Eliminar profesor P1:");
        uni.eliminarProfesor("P1");

        System.out.println("\nReporte de cursos por profesor:");
        uni.reporteCursosPorProfesor();
    }

}
