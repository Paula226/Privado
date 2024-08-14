/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

import java.util.ArrayList;

/**
 *
 * @author Paula Lopez
 */
public class Factura {
    // private Tarifa tarifa;

    private ArrayList<Tarifa> listaTarifa;
    private ArrayList<Persona> listaPersona;
    private double totalAcumulado;
    private String nombreFeria;

    public Factura(String nomFeria) {
        
        nombreFeria = nomFeria;
        listaTarifa = new ArrayList<>();
        listaPersona = new ArrayList<>();
        totalAcumulado = 0;
    }

    public void establecerNombreFeria(String c) {
      nombreFeria = c;
    }

    public String obtenerNombreFeria() {
        return nombreFeria;
    }

    public void establecerListaTarifa(ArrayList<Tarifa> c) {
        listaTarifa = c;
    }

    public void establecerListaPersona(ArrayList<Persona> c) {
        listaPersona = c;
    }
    public void establecerTotalAcumulado(){
        for (int i = 0; i < listaPersona.size(); i++) {
            totalAcumulado += listaTarifa.get(i).obtenerTarifa();
            
        }
    }
    public ArrayList<Tarifa> obtenerListaTarifa() {
        return listaTarifa;
    }

    public ArrayList<Persona> obtenerListaPersona() {
        return listaPersona;
    }

    public double obtenerTotalAcumulado() {
        return totalAcumulado;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura final\n"
                + "Nombre: %S\n",
                obtenerNombreFeria());
        for (int i = 0; i < listaPersona.size(); i++) {
            cadena += String.format("%s\n"
                    + "%.2f\n",
            listaPersona.get(i).toString(),
            listaTarifa.get(i).obtenerTarifa());

        }
        cadena = String.format("%s\n"
                + "Total tarifa: %.2f\n", cadena,totalAcumulado);
    return cadena;
    }
}
