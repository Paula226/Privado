/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;

/**
 *
 * @author Paula Lopez
 */
public class ListaTrabajadores {

    private String nombre;
    private ArrayList<Trabajador> listadoTrabajadores;
    private double sueldoTotales;

    public ListaTrabajadores( ArrayList<Trabajador> listTrabajadores){
        
        listadoTrabajadores = listTrabajadores;
        
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerListadoTrabajadores(ArrayList<Trabajador> c) {
        listadoTrabajadores = c;
    }

    public void establecerSueldoTotales() {
        sueldoTotales = 0;
        for (int i = 0; i < listadoTrabajadores.size(); i++) {
            sueldoTotales += listadoTrabajadores.get(i).obtenerSueldoFinal();

        }
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Trabajador> obtenerListadoTrabajadores() {
        return listadoTrabajadores;
    }

    public double obtenerSueldoTotales() {
        return sueldoTotales;
    }

    @Override
    public String toString() {
        String cadena = "Datos de Trabajadores: \n";
        for (int i = 0; i < listadoTrabajadores.size(); i++) {
            Trabajador trabajo1 = listadoTrabajadores.get(i);
            cadena += trabajo1 + "\n";

        }
        cadena = String.format("%s\n"
                + "------------------------------\n"
                + "\tSueldo Totales: %s\n",
                cadena,
                obtenerSueldoTotales());
        return cadena;

    }
}
