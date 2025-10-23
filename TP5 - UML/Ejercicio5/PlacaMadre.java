/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Maximiliano
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { return this.modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getChipset() { return this.chipset; }
    public void setChipset(String chipset) { this.chipset = chipset; }

    @Override
    public String toString() {
        return "PlacaMadre(" + "modelo=" + modelo + ", " + "chipset=" + chipset + ")";
    }
}
