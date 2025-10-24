/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Maximiliano
 */
public class TPN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Celular", 2500, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 1500, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla", 3000, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Pan", 800, 40, CategoriaProducto.ALIMENTOS));

        inventario.listarProductos();
        System.out.println("\nBuscar P003:");
        inventario.buscarProductoPorId("P003").mostrarInfo();

        System.out.println("\nFiltrar ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\nEliminar P002:");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        System.out.println("\nActualizar stock P001:");
        inventario.actualizarStock("P001", 60);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        System.out.println("\nTotal stock: " + inventario.obtenerTotalStock());

        System.out.println("\nMayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("\nFiltrar por precio $1000-$3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
