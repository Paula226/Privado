/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import paquete2.Vehiculo;

/**
 *
 * @author Paula Lopez Una concesionaria tiene los siguientes atributos: listado
 * de vehículos, nombre concesionaria, ventas totales de vehículos (con base al
 * listado de vehículos), costo del vehículo más caro (tomando en consideración
 * el listado de vehículos), costo del vehículo más barato.
 */
public class Consesionaria {

    private String nombre;
    private ArrayList<Vehiculo> listadoVehiculos;
    private double ventasTotales;
    private Vehiculo costoCaro;
    private Vehiculo costoBarato;

    public Consesionaria(String nom, ArrayList<Vehiculo> listVehiculos) {
        nombre = nom;
        listadoVehiculos = listVehiculos;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerListadoVehiculos(ArrayList<Vehiculo> c) {
        listadoVehiculos = c;
    }

    public void establecerVentasTotales() {

        ventasTotales = 0;
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            ventasTotales += listadoVehiculos.get(i).obtenerPrecioFinal();

        }
    }

    public void establecerCostoCaro() {
        costoCaro = listadoVehiculos.get(0);
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            if (listadoVehiculos.get(i).obtenerPrecioFinal() > costoCaro.obtenerPrecioFinal()) {
                costoCaro = listadoVehiculos.get(i);

            }

        }

    }
    
    public void establecerCostoBarato() {
        costoBarato = listadoVehiculos.get(0);
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            if (listadoVehiculos.get(i).obtenerPrecioFinal()< costoBarato.obtenerPrecioFinal()) {
            costoBarato = listadoVehiculos.get(i);
            }
            
        }
    }
            
    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Vehiculo> obtenerListadoVehiculos() {
        return listadoVehiculos;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public Vehiculo obtenerCostoCaro() {

        return costoCaro;
    }

    public Vehiculo obtenerCostoBarato() {
        return costoBarato;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Concesionaria: \n"
                + "Nombre: %s\n",obtenerNombre());
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            Vehiculo vehi = listadoVehiculos.get(i);
            cadena += vehi + "\n";
            
        }
        cadena = String.format("%s\n"
                + "-------------------------------o\n"
                + "\tVentas Totales: %.2f\n"
                + "\tVehiculo mas Caro: \n%s\n"
                + "\tVehiculo mas Barato: \n%s\n",
                cadena,
                obtenerVentasTotales(),
                obtenerCostoCaro(),
                obtenerCostoBarato());
        return cadena;
    }

}
