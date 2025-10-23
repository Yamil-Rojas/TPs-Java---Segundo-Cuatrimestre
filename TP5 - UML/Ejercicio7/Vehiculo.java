/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Maximiliano
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    public String getPatente() { return this.patente; }
    public void setPatente(String patente) { this.patente = patente; }
    public String getModelo() { return this.modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Motor getMotor() { return this.motor; }
    public void setMotor(Motor motor) { this.motor = motor; }
    public Conductor getConductor() { return this.conductor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }

    @Override
    public String toString() {
        return "Vehiculo(" + "patente = " + patente + ", " + "modelo = " + modelo + ", " + "motor = " + motor + ", " + "conductor = " + conductor + ")";
    }
}
