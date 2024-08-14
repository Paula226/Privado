/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class Comprador {
    private String nombre;
    private String cedula;

    public Comprador(String nom, String ced) {
        nombre = nom;
        cedula = ced;
    }
    public void establecerNombre(String c){
        nombre = c;
        
    }
    public void establecerCedula(String c) {
        cedula = c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerCedula() {
        return cedula;
    }
    @Override
    public String toString() {
        String cadena = String.format("Datos el Comprador:\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n",
                obtenerNombre(),
                obtenerCedula());
        return cadena;
}
}