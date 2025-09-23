/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.n.pkg3;

/**
 *
 * @author Maximiliano
 */

public class NaveEspacial {
   
    
    String nombre;
    int combustible;
    int kmAvanzados;
    int consumoCada500kms = 10; // simulamos un consumo de 10 unidades cada 500kms
    
    public double getCombustible() { 
        return combustible;
    }
    public void setCombustible(int cantidad){
        this.combustible = combustible;
    }
    
     public int getKmAvanzados() { 
        return kmAvanzados;
    }
    public void setKmAvanzados(int kmAvanzados){
        this.kmAvanzados = kmAvanzados;
    }
    public void despegar(){
        System.out.println("Despegamos en: 3, 2, 1......");
    }
    public void avanzar(int distancia){
        if (combustible >= 50) {
            kmAvanzados += distancia;
        }else {
            System.out.println("Unidades de combustible insuficientes, recargue hasta 5000 unidades");
        }
    }
    public void recargarCombustible(int cantidad){
        if (combustible > 5000) {
            System.out.println("Alcanzó el limite de unidades, se detuvo la recarga para poder avanzar.");   
        }else {
            System.out.println("Se recargaron: " + cantidad + " unidades.");
            combustible += cantidad;
            combustible -= consumoCada500kms;
        } 
    }
            
     public void mostrarEstado(){
                   System.out.println("Nave " + nombre + ", " + combustible  + " unidades de combustible, " + kmAvanzados + " kilometros avanzados." );
         }
     
    
}

