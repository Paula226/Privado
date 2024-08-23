/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class ProductoAlimenticio extends Producto {

    private double descuentoAlimenticio;

    public ProductoAlimenticio(String nom, double precioB, double descuentoAlimen) {
        super(nom, precioB);
        descuentoAlimenticio = descuentoAlimen;
    }

    public void establecerDescuentoAlimenticio(double c) {
        descuentoAlimenticio = c;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase * descuentoAlimenticio;
    }

    public double obtenerDescuentoAlimenticio() {
        return descuentoAlimenticio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datod de Producto Alimenticio\n"
                + "%s\n"
                + "\t Porcentaje de descuento: %.2f\n"
                + "\tPrecio Final: %.2f\n",
                super.toString(),
                obtenerDescuentoAlimenticio(),
                obtenerPrecioFinal());
        return cadena;
    }
}
