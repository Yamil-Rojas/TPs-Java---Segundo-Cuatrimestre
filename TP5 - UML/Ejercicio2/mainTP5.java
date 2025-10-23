/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.time.*;
/**
 *
 * @author Maximiliano
 */
public class mainTP5 {
     public static void main(String[] args) {
        Celular celu = new Celular("imei_ej2", "marca_ej2", "modelo_ej2", null, null);
        Bateria Bate = new Bateria("modelo_ej2", 1);
        Usuario Usu1 = new Usuario("nombre_ej2", "dni_ej2");
        System.out.println("Ejercicio 02 - Celular_Bateria_Usuario: ejemplo de ejecución");
        System.out.println(celu);
}
}