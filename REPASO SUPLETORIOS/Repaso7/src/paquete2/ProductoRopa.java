/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class ProductoRopa extends Producto{
    private double descuentoRopa;

    public ProductoRopa( String nom, double precioB, double descuentoRopa) {
        super(nom, precioB);
        this.descuentoRopa = descuentoRopa;
    }

    public void establecerDescuentoRopa(double c) {
        descuentoRopa = c;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase * descuentoRopa;
    }

    public double obtenerDescuentorRopa() {
        return descuentoRopa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datod de Producto Electronicoo\n"
                + "%s\n"
                + "\tPorcentaje de descuento: %.2f\n"
                + "\tPrecio Final: %.2f\n",
                super.toString(),
                obtenerDescuentorRopa(),
                obtenerPrecioFinal());
        return cadena;
    }
}
