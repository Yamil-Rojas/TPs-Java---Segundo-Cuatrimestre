/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.n.pkg3;

/**
 *
 * @author Maximiliano
 */
public class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;
    
    public String getIdGallina() {
    return idGallina;
    }
    public void setIdGallina(String idGallina){
        this.idGallina = idGallina;          
    }
    public int getEdad() {
    return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getHuevosPuestos(){
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestos){
        this.huevosPuestos = huevosPuestos;
    }
    
     // Métodos
    
    public void ponerHuevos(){
        huevosPuestos ++;
    }
    public void envejecer(){
        edad++;
    }
    public void mostrarEstado(){
        System.out.println("Nombre: " + idGallina + " \nEdad: " + edad + " \nHuevos puestos: " + huevosPuestos);
    }
}
