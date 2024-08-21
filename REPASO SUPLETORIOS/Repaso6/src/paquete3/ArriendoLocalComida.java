/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.Arriendo;

/**
 *
 * @author Paula Lopez
 */
public class ArriendoLocalComida extends Arriendo {
    private double valorLuz;
    private double valorAgua;
    private double iva;

     public ArriendoLocalComida(String nombre, double cuotaB){ // pasarela donde se llama el constructor de la super clase 
        super(nombre, cuotaB);
    
    }

    public ArriendoLocalComida(String nombre,double cuotaB,
            double valLuz, double valAgua, double iv) {
        super(nombre,  cuotaB);
        valorLuz = valLuz;
        valorAgua = valAgua;
        iva = iv;
    }

    public void establecerValorLuz(double c) {
        valorLuz = c;
    }

    public void establecerValorAgua(double c) {
        valorAgua = c;
    }

    public void establecerIva(double c) {
        iva = c;
    }

    @Override
    public void establecerArriendoMensual() {
        double subtotal = obtenerValorAgua() + obtenerValorLuz() + 
                obtenerCuotaBase();
        
        arriendoMensual = subtotal + (subtotal *(obtenerIva()/100));
    }

    public double obtenerValorLuz() {
        return valorLuz;
    }

    public double obtenerValorAgua() {
        return valorAgua;
    }

    public double obtenerIva() {
        return iva;
    }
    
    @Override
    public String toString() {
    String cadena = String.format(
            "Arriendo Local Comida\n"
            + "\tNombre del Arrendatario: %s\n"
            + "\tCuota Base: %.2f\n"
            + "\tValor Luz: %.2f\n"
            + "\tValor Agua: %.2f\n"
            + "\tPorcentaje Iva: %.2f\n"
            + "\tArriendo Total: %.2f\n",
            obtenerNombreArrendatario(),
            obtenerCuotaBase(),
            obtenerValorLuz(),
            obtenerValorAgua(),
            obtenerIva(),
            obtenerArriendoMensual());
    return cadena;
}
    
}
