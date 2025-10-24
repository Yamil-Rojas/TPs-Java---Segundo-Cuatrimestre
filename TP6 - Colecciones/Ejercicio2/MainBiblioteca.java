/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Maximiliano
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Autor a1 = new Autor("A1", "Borges", "Argentina");
        Autor a2 = new Autor("A2", "Cortázar", "Argentina");
        Autor a3 = new Autor("A3", "García Márquez", "Colombia");

        Biblioteca biblio = new Biblioteca("Biblioteca Central");
        biblio.agregarLibro("L001", "Ficciones", 1944, a1);
        biblio.agregarLibro("L002", "Rayuela", 1963, a2);
        biblio.agregarLibro("L003", "Cien años de soledad", 1967, a3);
        biblio.agregarLibro("L004", "El Aleph", 1949, a1);
        biblio.agregarLibro("L005", "Bestiario", 1951, a2);

        biblio.listarLibros();
        System.out.println("\nBuscar L003:");
        biblio.buscarLibroPorIsbn("L003").mostrarInfo();

        System.out.println("\nFiltrar por año 1949:");
        biblio.filtrarLibrosPorAnio(1949);

        System.out.println("\nEliminar L002:");
        biblio.eliminarLibro("L002");
        biblio.listarLibros();
    }
}
