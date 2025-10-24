/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
 import java.util.ArrayList;

/**
 *
 * @author Maximiliano
 */

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) { productos.add(p); }
    public void listarProductos() { productos.forEach(Producto::mostrarInfo); }

    public Producto buscarProductoPorId(String id) {
        return productos.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) p.setCantidad(nuevaCantidad);
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        productos.stream().filter(p -> p.getCategoria() == categoria).forEach(Producto::mostrarInfo);
    }

    public int obtenerTotalStock() {
        return productos.stream().mapToInt(Producto::getCantidad).sum();
    }

    public Producto obtenerProductoConMayorStock() {
        return productos.stream().max((a, b) -> Integer.compare(a.getCantidad(), b.getCantidad())).orElse(null);
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        productos.stream().filter(p -> p.getPrecio() >= min && p.getPrecio() <= max).forEach(Producto::mostrarInfo);
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " + c.getDescripcion());
        }
    }
}


