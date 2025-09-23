/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.n.pkg3;
import java.util.Scanner;
/**
 *
 * @author Maximiliano
 */
public class TPN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Registro de Estudiantes.
        System.out.println("Registro de Estudiante."); 
        Estudiante E1 = new Estudiante();
         E1.apellido = "Rojas";
         E1.nombre = "Maxi";
         E1.curso = "Programacion2";
         E1.calificacion = 8.5;
            
         E1.mostrarInfo();
         E1.subirCalificacion(1.5);
         E1.bajarCalificacion(0.5);
         System.out.println(" ");          //Salto de línea
         
        // Registro de Mascotas   ______________________________________________________
         System.out.println("Registro de mascotas.");                    

         Mascota perro = new Mascota();
         perro.nombre = "Hercules";
         perro.especie = "Chihuahua";
         perro.edad = 8;
            
         perro.mostrarInfo();
         perro.cumplirAnios(1);
         System.out.println(" ");       //Salto de línea
         
         // Encapsulamiento con la clase Libro _____________________________________________
         System.out.println("Encapsulamiento con la clase Libro ");                
         Scanner input = new Scanner(System.in);
         
         Libro Libro1 = new Libro();
         System.out.println("Ingrese el año de publicación: ");
         int anio = input.nextInt();
         Libro1.setAnioPublicacion(anio);  
         System.out.println(" "); 
         Libro1.mostrarInfo();
         System.out.println(" ");                   //Salto de línea
         
         // Gestión de Gallinas en Granja Digital  __________________________________________   
         System.out.println("Granja digital. ");  
         Gallina gallina1 = new Gallina();
         gallina1.setIdGallina("Turu");
         gallina1.setEdad(2);
         gallina1.setHuevosPuestos(12);
                  
         Gallina gallina2 = new Gallina();
         gallina2.setIdGallina("Leca");
         gallina2.setEdad(4);
         gallina2.setHuevosPuestos(16);
         
         System.out.println(" ");       //Salto de línea
         
         gallina1.mostrarEstado();
          System.out.println(" ");
         gallina2.mostrarEstado();
         System.out.println(" ");                       
         
         System.out.println("Acciones simuladas.");                
         gallina1.ponerHuevos();
         gallina1.envejecer();
         gallina2.ponerHuevos();
         gallina2.envejecer();
         
         gallina1.mostrarEstado();
          System.out.println(" ");
         gallina2.mostrarEstado();
         System.out.println(" ");               //Salto de línea                      
         
         // Simulación de Nave Espacial __________________________________________________________
         System.out.println("Nave espacial.");
         NaveEspacial Nave1 = new NaveEspacial();
         Nave1.nombre = "Apollo 25";
         Nave1.setCombustible(50);
         Nave1.setKmAvanzados(0);  
         Nave1.mostrarEstado();
         Nave1.avanzar(0);
         System.out.println(" ");
         
         Nave1.recargarCombustible(2500);
         System.out.println(" ");
         
         Nave1.despegar();
         Nave1.avanzar(500);           // Intentamos avanzar 500kms
         
         System.out.println(" ");
          Nave1.mostrarEstado();
         
         
         
         
         
    }
    
    
}
