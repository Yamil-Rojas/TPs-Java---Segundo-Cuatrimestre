/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Maximiliano
 */
public class MainEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Juan", 50000),
            new EmpleadoTemporal("Ana", 20, 1500)
        };

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre + " - Sueldo: " + e.calcularSueldo());
        }
    }

}
