/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public abstract class Producto {
    protected String nombre;
    protected double precioBase;
    protected double precioFinal;

    public Producto(String nom, double precioB) {
        nombre = nom;
        precioBase = precioB;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerPrecioBase(double c) {
        precioBase = c;
    }

    public abstract void establecerPrecioFinal();

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "\tPrecio Base: %.2f\n", 
                obtenerNombre(),
                obtenerPrecioBase());
        return cadena;
    }
}
