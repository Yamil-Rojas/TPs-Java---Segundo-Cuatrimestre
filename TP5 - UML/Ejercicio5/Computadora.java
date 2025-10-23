/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Maximiliano
 */
public class Computadora {
     private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
    }

    public String getMarca() { return this.marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getNumeroSerie() { return this.numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public PlacaMadre getPlacaMadre() { return this.placaMadre; }
    public void setPlacaMadre(PlacaMadre placaMadre) { this.placaMadre = placaMadre; }
    public Propietario getPropietario() { return this.propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }

    @Override
    public String toString() {
        return "Computadora(" + "marca = " + marca + ", " + "numeroSerie = " + numeroSerie + ", " + "placaMadre = " + placaMadre + ", " + "propietario = " + propietario + ")";
    }
}
