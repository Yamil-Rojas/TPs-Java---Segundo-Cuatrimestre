/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Maximiliano
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
    }

    public String getImei() { return this.imei; }
    public void setImei(String imei) { this.imei = imei; }
    public String getMarca() { return this.marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return this.modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Bateria getBateria() { return this.bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }
    public Usuario getUsuario() { return this.usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    @Override
    public String toString() {
        return "Celular(" + "imei=" + imei + ", " + "marca=" + marca + ", " + "modelo=" + modelo + ", " + "bateria=" + bateria + ", " + "usuario=" + usuario + ")";
    }
}
