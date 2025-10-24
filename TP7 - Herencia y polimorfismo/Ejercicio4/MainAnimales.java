/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Maximiliano
 */
public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }

}
