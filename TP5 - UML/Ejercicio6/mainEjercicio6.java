/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Maximiliano
 */
public class mainEjercicio6 {
     public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maxi", "9090");
        Mesa mesa1 = new Mesa(1, 1);
        Reserva R1 = new Reserva(LocalDate.now(), LocalTime.now(), cliente1, mesa1);
        System.out.println("Ejercicio 06 - Reserva_Cliente_Mesa: ejemplo de ejecución");
        System.out.println(R1);
    }
}
