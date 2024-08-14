/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public abstract class Vehiculo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador propie, String mar, double preBase) {
        propietario = propie;
        marca = mar;
        precioBase = preBase;
    }

    public void establecerPropietario(Comprador c) {
        propietario = c;
    }

    public void establcerMarca(String c) {
        marca = c;
    }

    public void establecerPrecioBase(double c) {
        precioBase = c;
    }

    public abstract void establecerPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Vehiculo:\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Precio Base: %.2f\n"
                + "Precio Final: %.2f\n",
                obtenerPropietario(),
                obtenerMarca(),
                obtenerPrecioBase(),
                obtenerPrecioFinal());
        return cadena;

    }
}
