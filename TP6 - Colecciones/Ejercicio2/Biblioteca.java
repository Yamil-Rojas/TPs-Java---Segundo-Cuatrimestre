/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.ArrayList;
/**
 *
 * @author Maximiliano
 */
public class Biblioteca {
        private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anio, Autor autor) {
        libros.add(new Libro(isbn, titulo, anio, autor));
    }

    public void listarLibros() {
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        return libros.stream().filter(l -> l.getIsbn().equalsIgnoreCase(isbn)).findFirst().orElse(null);
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        libros.stream().filter(l -> l.getAnioPublicacion() == anio).forEach(Libro::mostrarInfo);
    }

    public void mostrarAutoresDisponibles() {
        libros.stream().map(Libro::getAutor).distinct().forEach(Autor::mostrarInfo);
    }

}
