/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programacion2;
import java.util.Scanner;
/**
 *
 * @author Maximiliano
 */
public class TPN2 {
         static double precioBase;     
    public static double calcularPrecioFinal(double impuesto, double descuento) {    
         double descuentoFinal = descuento / 100;
         double impuestoFinal = impuesto / 100;
         double PrecioFinal = precioBase + (precioBase * impuestoFinal) - (precioBase * descuentoFinal);
         //PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento); 
         return PrecioFinal;
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona iunválida. no declara costo");
            return 0.0;
        }
        return peso * costoPorKg;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    static double descuentoEspecial = 0.10;

     public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
       
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
     
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1);
        }
    }
        public static void main(String[] args) {
        // Ejercicio n°1: 
        //Verificación de Año Bisiesto. 
        // Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
        //Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400. 
        
       Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = input.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        // Ejercicio n° 2
       /* Determinar el Mayor de Tres Números. 
           Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor. */
       
        System.out.print("Ingrese un numero entero: ");
         int n1 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
         int n2 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
         int n3 = input.nextInt();
         int mayor;
        if (n1 > n2 && n1 > n3) {
           mayor = n1;
        } else if (n2 > n1 && n2 > n3) {
           mayor = n2;
        } else{
            mayor = n3;
        }
        System.out.println("El mayor es: " + mayor);    

       
         // Ejercicio n° 3
         /* Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla: 
             Menor de 12 años: "Niño" 
             Entre 12 y 17 años: "Adolescente" 
             Entre 18 y 59 años: "Adulto" 
             60 años o más: "Adulto mayor" */
            
            System.out.print("Ingresá tu edad: ");
             int edad = input.nextInt();
             
             if (edad <= 0){
                System.out.println("La edad debe ser mayor  a 0.");  
             } else if (edad < 12){ 
                System.out.println("Eres un Niño/a.");
             } else if (edad < 18){
                System.out.println("Eres un Adolescente.");
             } else if (edad < 60) {
                System.out.println("Eres un Adulto.");
             } else {
                System.out.println("Eres un Adulto Mayor."); 
            } 
             
         // Ejercicio n°4 
         /*Calculadora de Descuento según categoría. 
            Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C). 
            Luego, aplique los siguientes descuentos: 
            Categoría A: 10% de descuento 
            Categoría B: 15% de descuento  
            Categoría C: 20% de descuento 
            El programa debe mostrar el precio original, el descuento aplicado y el precio final */ 
                  
         System.out.println("Ingrese el precio del producto: ");
         double precio = input.nextDouble();
         input.nextLine();
         System.out.println("Ingrese la categoría del producto (A, B, C): ");
         String categoria = input.nextLine();
         double precioFinal = 0;
         
         if (categoria.equalsIgnoreCase("A")){
         precioFinal = precio * 0.90;
         } else if (categoria.equalsIgnoreCase("B")){
         precioFinal = precio * 0.85;
         } else if (categoria.equalsIgnoreCase("C")){
         precioFinal = precio * 0.80;
         } 
         System.out.println("El precio final del producto es: " + precioFinal);  
         
         // Ejercicio n°5
         //Escribe un programa que solicite números al usuario y sume solo los números pares.
         //El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados. 
                  
         int pares = 0;
         int nro;
         System.out.println("Ingrese un numero (0 para salir): ");
         nro = input.nextInt();
         
         while (nro != 0){
             if (nro % 2 == 0) {
                   pares += nro;
             } 
             System.out.println("Ingrese otro numero (0 para salir): ");
              nro = input.nextInt();
         }
         System.out.println("La suma final es:  " + pares); 
            
         // Ejercicio n°6
         //Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
         
         int numer;
         int positivos = 0;
         int negativos = 0;
         int ceros = 0;
         
                  
         for (int i = 0; i < 10; i++) {
         System.out.println("Por favor, ingrese un numero: ");
         numer = input.nextInt();
             if (numer == 0) {
                ceros ++;
            }else if ( numer < 1){
                negativos ++;
            }else {
                positivos ++;
            }
         }
         System.out.println("Los resultados son: \n"
                                    + "Positivos: " + positivos + "\n" +
                                      "Negativos: " + negativos + "\n" +
                                     "Ceros: " + ceros);        
         // Ejercicio n° 7
         // Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, 
         // debe seguir pidiéndole la nota hasta que ingrese un valor válido. 
         
         int num =0;
        do {
             System.out.println("Ingrese un numero");
                num = input.nextInt();
             if (num < 0 || num > 10) {
             System.out.println("Numero invalido, ingreselo nuevamente.");    
             }
         } while (num < 0 || num >10); 
         System.out.println("El numero es: " + num);  
         
         // Ejercicio n° 8
         // Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce.
         
         System.out.print("Ingrese el precio del producto: ");
         precioBase = input.nextDouble();
         System.out.print("Ingrese el impuesto (Ejemplo: 10 para 10%): ");
         double impuesto = input.nextDouble();
         System.out.print("Ingrese el descuento (Ejemplo: 5 para 5%): ");
         double descuento = input.nextDouble();
         double precioFinal = calcularPrecioFinal(impuesto, descuento);
         System.out.println("El precio final del producto es: " + precioFinal); 

         // Ejercicio n° 9
         //Composición de funciones para calcular costo de envío y total de compra. 
         
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine();                                               // Limpia el buffer para que el código continúe.
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        // Calcular total de compra
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + total); 
        
         // Ejercicio n° 10
         //Actualización de stock a partir de venta y recepción de productos.
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
        //Mostrar el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock); 

        // Ejercicion n° 11
        //Cálculo de descuento especial usando variable global. 
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
         calcularDescuentoEspecial(precio);          // Llamar al método para calcular y mostrar el descuento 
        
        // Ejercicio n° 12
        //Modificación de un array de precios y visualización de resultados. 
        
        // a. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        // c. Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;
        
        // d. Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        
        // Ejercicio n° 13
        //Impresión recursiva de arrays antes y después de modificar un elemento.
        
        // a. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        // c. Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;
        
        // d. Mostrar precios modificados
       System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0); 
        

        
    }
    
}
