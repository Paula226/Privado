/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public abstract class Arriendo {
    protected String nombreArrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;

    public Arriendo(String nombre, double cuotaB) {
       establecerNombreArrendatario(nombre);
        cuotaBase = cuotaB;
    }

    public void establecerNombreArrendatario(String c) {
        nombreArrendatario = c;
    }

    public abstract void establecerArriendoMensual();
    

    public void establecerCuotaBase(double c) {
        cuotaBase = c;
    }

    public String obtenerNombreArrendatario() {
        return nombreArrendatario;
    }

    public double obtenerArriendoMensual() {
        return arriendoMensual;
    }

    public double obtenerCuotaBase() {
        return cuotaBase;
    }
    
    
}
