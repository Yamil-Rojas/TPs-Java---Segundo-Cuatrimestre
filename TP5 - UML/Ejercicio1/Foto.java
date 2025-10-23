package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maximiliano
 */
public class Foto {
    private byte[] imagen;
    private String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
}

public byte[] getImagen() { return this.imagen; }
    public void setImagen(byte[] imagen) { this.imagen = imagen; }
    public String getFormato() { return this.formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public String toString() {
        return "Foto(" + "imagen=" + imagen + ", " + "formato=" + formato + ")";
  
 }
    
}