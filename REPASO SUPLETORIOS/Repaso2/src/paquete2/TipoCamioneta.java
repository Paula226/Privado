/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicional;
    private double valorAdicional;
    private double seguroAdicional;

    public TipoCamioneta(double porcenAdicional,
            Comprador propie, String mar, double preBase) {
        super(propie, mar, preBase);
        porcentajeAdicional = porcenAdicional;

    }

    public void establecerPorcentajeAdicional(double c) {
        porcentajeAdicional = c;
    }

    public void establecerValorAdicional() {
        valorAdicional = (porcentajeAdicional / 100) * precioBase;
    }

    public void establecerSeguroAdicional() {
        seguroAdicional = valorAdicional * 1.5;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorAdicional + seguroAdicional;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    public double obtenerSeguroAdicional() {
        return seguroAdicional;
    }

    public String toString() {
        String cadena = String.format("Tipo Camioneta:\n"
                + "Comprador: \n%s\n"
                + "\tPorcentaje Adicionaln fijo por Impotación: %.2f\n"
                + "\tValor de Adicional fijo de Importación: %.2f\n"
                + "\tSeguro Adicional de Mantenimiento: %.2f\n"
                + "\tPrecio Base: $%.2f\n"
                + "\tPrecio Final: $%.2f\n",
                propietario.toString(),
                obtenerPorcentajeAdicional(),
                obtenerValorAdicional(),
                obtenerSeguroAdicional(),
                obtenerPrecioBase(),
                obtenerPrecioFinal());
        return cadena;
    }
}
