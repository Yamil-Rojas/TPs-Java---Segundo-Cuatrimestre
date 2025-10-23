/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Maximiliano
 */
public class mainEjercicio7 {
    public static void main(String[] args) {
        Vehiculo V1 = new Vehiculo("AAA000", "2020", null, null);
        Motor motor1 = new Motor("V8", "098765");
        Conductor conductor1 = new Conductor("Meteoro", "Licencia 10");
        System.out.println("Ejercicio 07 - Vehiculo_Motor_Conductor: ejemplo de ejecución");
        System.out.println(V1);
        System.out.println(motor1);
        System.out.println(conductor1);
    }
}
