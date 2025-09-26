/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.n.pkg4;

/**
 *
 * @author Maximiliano
 */
public class Empleado {
  
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático compartido por todos
    private static int totalEmpleados = 0;
    private static int contador = 1; 

    // Constructor con todos los parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = contador++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; 
        totalEmpleados++;
    }

     public void actualizarSalario(double porcentaje) {          // Método sobrecargado.
        this.salario += this.salario * (porcentaje / 100);
    }
     public void actualizarSalario(int cantidad) {              // Método sobrecargado.
        this.salario += cantidad;
    }

    // Getters y setters
    public int getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    public String getPuesto() { 
        return puesto; 
    }
    public void setPuesto(String puesto) { 
        this.puesto = puesto; 
    }
    public double getSalario() { 
        return salario; 
    }
    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // toString para mostrar datos del empleado
    @Override
    public String toString() {
        return "Empleado (ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + ")";
    }


    
}
