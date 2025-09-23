/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.n.pkg3;
import java.util.Scanner;
/**
 *
 * @author Maximiliano
 */
public class Libro { // Coloco estos valores en la clase para darle forma al ejercicio, comprendo que de seguir creando libros, todos tendrían los mismos valores.
    private String titulo = "Todos los fuegos el fuego";    
    private String autor = "Julio Cortazar";
    private int anioPublicacion = 1966;
    Scanner input = new Scanner(System.in);
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }  
         
    public void setAnioPublicacion(int anio) {
        if (anio == anioPublicacion) {
            System.out.println("Correcto! el año es válido: " + anio);
        } else {
            System.out.println("Año inválido!: " + anio);
            System.out.println("Ingrese el año de publicación (pista, en 2025 cumplió 59 años : ");
            anio = input.nextInt();
            
            while (anio != anioPublicacion){
                     System.out.println("Año inválido!: " + anio);
                     System.out.println("Ingrese el año de publicación (pista, en 2025 cumplió 59 años : ");
                     anio = input.nextInt();
            }
            
            System.out.println("Correcto el año es válido!: " + anio);
        }
    }    
    public void mostrarInfo(){
        System.out.println("Título: " + titulo + " \nAutor: " + autor + " \nAño de publicación: " + anioPublicacion);
    }
    
}
