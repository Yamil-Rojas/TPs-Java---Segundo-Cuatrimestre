/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Maximiliano
 */
public class mainEjercicio5 {
    public static void main(String[] args) {
        Computadora Pc1 = new Computadora("Multivac", "R2D2", null, null);
        PlacaMadre Placa = new PlacaMadre("modelo", "chipset");
        Propietario Prop = new Propietario("Arturo", "123245");
        System.out.println("Ejercicio 05 - Computadora_PlacaMadre_Propietario: ejemplo de ejecución");
        System.out.println(Pc1);
    }
}
