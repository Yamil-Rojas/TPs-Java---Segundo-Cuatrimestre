/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Maximiliano
 */
public class mainEjercicio3 {
    public static void main(String[] args) {
        Libro Libro1 = new Libro("Operación Masacre", "isbn_ej3", null, null);
        Autor obj2 = new Autor("Rodolfo Walsh", "nacionalidad_ej3");
        Editorial obj3 = new Editorial("nombre_ej3", "direccion_ej3");
        System.out.println("Ejercicio 03 - Libro_Autor_Editorial: ejemplo de ejecución");
        System.out.println(Libro1);
    }
}
