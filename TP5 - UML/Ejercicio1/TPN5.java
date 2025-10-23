/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.time.*;
/**
 *
 * @author Maximiliano
 */
public class TPN5 {

    public static void main(String[] args) {
        Pasaporte P1 = new Pasaporte ("35773681", LocalDate.now(), null, null);
        Foto F1 = new Foto(new byte[0], "Foto-Carnet");
        Titular T1 = new Titular("Maximiliano", "123456");
        System.out.println("Ejercicio 01 - Pasaporte_Foto_Titular: ejemplo de ejecución");
        System.out.println(P1);
    }
    
}
