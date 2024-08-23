/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class ProductoElectronico extends Producto {

    private double descuentoElectronico;

    public ProductoElectronico(String nom, double precioB, double descuEloectronico) {
        super(nom, precioB);
        descuentoElectronico = descuEloectronico;
    }

    public void establecerDescuentoElectronico(double c) {
        descuentoElectronico = c;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase * descuentoElectronico;
    }

    public double obtenerDescuentoElectronico() {
        return descuentoElectronico;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datod de Producto Electronicoo\n"
                + "%s\n"
                + "\tPorcentaje de descuento: %.2f\n"
                + "\tPrecio Final: %.2f\n",
                super.toString(),
                obtenerDescuentoElectronico(),
                obtenerPrecioFinal());
        return cadena;
    }
}
