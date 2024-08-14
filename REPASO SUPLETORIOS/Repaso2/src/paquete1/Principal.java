/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.*;
import java.util.ArrayList;
import paquete3.Consesionaria;

public class Principal {
    public static void main(String[] args) {
    
        Comprador comprador1 = new Comprador("Juan Pérez", "123456789");
        Comprador comprador2 = new Comprador("Ana Gómez", "987654321");

        TipoSuv suv = new TipoSuv(10.0, comprador1,"Toyota", 30000);
        suv.establecerSeguroPersona();
        TipoSedan sedan = new TipoSedan(5.0,comprador2, "Honda", 20000);
        sedan.establecerValorDescuento();
        sedan.establecerSeguroMecanico();
        TipoCamioneta camioneta = new TipoCamioneta(8.0,comprador1, "Ford", 40000);
        camioneta.establecerValorAdicional();
        camioneta.establecerSeguroAdicional();

        // Crear lista de vehículos
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        
        listaVehiculos.add(suv);
        listaVehiculos.add(sedan);
        listaVehiculos.add(camioneta);
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).establecerPrecioFinal();
        }

        String nombre = "DiegoAutos";
        Consesionaria concesi1 = new Consesionaria(nombre, listaVehiculos);
        concesi1.establecerVentasTotales();
        concesi1.establecerCostoCaro();
        concesi1.establecerCostoBarato();
     
        System.out.println(concesi1);
    }
}
