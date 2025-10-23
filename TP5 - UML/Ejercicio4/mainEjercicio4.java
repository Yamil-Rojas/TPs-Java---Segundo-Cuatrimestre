/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;
import java.time.*;
/**
 *
 * @author Maximiliano
 */
public class mainEjercicio4 {
     public static void main(String[] args) {
        TarjetaCredito Tarj1 = new TarjetaCredito("0303456", LocalDate.now(), null, null);
        Cliente Cliente1 = new Cliente("nRoberto Carlos", "35773681");
        Banco Ban1 = new Banco("Galicia", "33445566");
        System.out.println("Ejercicio 04 - TarjetaCredito_Cliente_Banco: ejemplo de ejecución");
        System.out.println(Tarj1);
        System.out.println(Cliente1);
       System.out.println(Ban1);
     }
}
