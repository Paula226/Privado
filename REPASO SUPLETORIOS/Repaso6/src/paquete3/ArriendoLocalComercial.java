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
public class ArriendoLocalComercial extends Arriendo {
    protected double valorAdicionalFijo;

    public ArriendoLocalComercial(String nombre, double cuotaB) {
        super(nombre, cuotaB);
        
    }

    @Override
    public void establecerNombreArrendatario(String nombre) {
        nombreArrendatario = nombre.toUpperCase();
    }

    public void establecerValorAdicionalFijo(double c) {
        valorAdicionalFijo = c;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = cuotaBase + valorAdicionalFijo;
         
    }
    public double obtenerValorAdicionalFijo() {
        return valorAdicionalFijo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Arriendo De Local Comercial\n"
                + "\tNombre Arrendatario: %s\n"
                + "\tCuota Base: %.2f\n"
                + "\tValor Adicional: %.2f\n"
                + "\tArriendo Total: %.2f\n",
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorAdicionalFijo(),
                obtenerArriendoMensual());
        return cadena;
    }
}
