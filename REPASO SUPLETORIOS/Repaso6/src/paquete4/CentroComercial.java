/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;


import java.util.ArrayList;
import paquete2.Arriendo;


public class CentroComercial {

    private String nombre;
    private ArrayList<Arriendo> arriendos = new ArrayList<>();
    private double totalArriendosFinalMensual;
    private double totalArriendosBaseMensual;
    
    public CentroComercial(String nom, ArrayList<Arriendo> lista) {
        nombre = nom;
        arriendos = lista;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerArriendos(ArrayList<Arriendo> c) {
        arriendos = c;
    }

    public void establecerTotalArriendosFinalMensual() {
        for (int i = 0; i < arriendos.size(); i++) {
            totalArriendosFinalMensual = totalArriendosFinalMensual + 
                    obtenerArriendos().get(i).obtenerArriendoMensual();
                    
            
        }
        
    }

    public void establecerTotalArriendosBaseMensual() {
        for (int i = 0; i < arriendos.size(); i++) {
        totalArriendosBaseMensual = totalArriendosBaseMensual +
                obtenerArriendos().get(i).obtenerCuotaBase();
        }
        
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Arriendo> obtenerArriendos() {
        return arriendos;
    }

    public double obtenerTotalArriendosFinalMensual() {
        return totalArriendosFinalMensual;
    }

    public double obtenerTotalArriendosBaseMensual() {
        return totalArriendosBaseMensual;
    }
     @Override
    public String toString() {
        String cadena = String.format("Datos Centro Comercial\n"
                + "Nombre: %s\n"
                + "Lista de Locales\n\n", obtenerNombre());

        for (int i = 0; i < obtenerArriendos().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerArriendos().get(i));
        }

        cadena = String.format("\n%sTotal Arriendos base Mensual: %.2f\n"
                + "Total Arriendos Mensual: %.2f\n",
                cadena,
                obtenerTotalArriendosBaseMensual(),
                obtenerTotalArriendosFinalMensual());
        return cadena;
    }
}
