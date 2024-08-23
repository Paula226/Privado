/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class Empleado {
    private String nombre;
    private String identificacion;
    private double salarioBase;
    double salarioTotal;

    public Empleado(String nom, String ide,
            double salarioB) {
        nombre = nom;
        identificacion = ide;
        salarioBase = salarioB;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public void establecerSalarioBase(double c) {
        salarioBase = c;
    }

    public void establecerSalarioTotal(){
    }

    public double obtenerSalarioTotal() {
        return salarioTotal;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }
    @Override
    public String toString(){
        String cadena = String.format("\tNombre: %s\n"
                + "\tIdentificacion: %s\n"
                + "\tSalario Base: %.2f" , 
                obtenerNombre(),
                obtenerIdentificacion(),
                obtenerSalarioBase());
        return cadena;
    }
    
    
}
