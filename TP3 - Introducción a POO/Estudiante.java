package tp.n.pkg3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maximiliano
 */
public class Estudiante {
         String nombre;
         String apellido;
         String curso;
         double calificacion;
         
         public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + " \nApellido: " + apellido + " \nCurso: " + curso + " \nCalificacion: " + calificacion);
         }   
         
         public void subirCalificacion(double puntos){
            calificacion += puntos;
             System.out.println("Calificacion modificada: " + calificacion);
         }
         public void bajarCalificacion(double puntos){
            calificacion -= puntos;
             System.out.println("Nueva calificacion: " + calificacion); 
         }
}
