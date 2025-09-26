/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.n.pkg4;

/**
 *
 * @author Maximiliano
 */
public class TPN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear empleados con distintos constructores
        Empleado e1 = new Empleado("Juan Pérez", "Analista");
        Empleado e2 = new Empleado("María Gómez", "Desarrolladora");
        Empleado e3 = new Empleado(100, "Carlos López", "Gerente", 120000);

        // Aumentar salario
        e1.actualizarSalario(10);   // 10% aumento
        e2.actualizarSalario(5000); // aumento fijo

        // Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total empleados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
