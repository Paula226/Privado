/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class TipoSuv extends Vehiculo {

    private double porcentajeSeguroPersona;
    private double seguroPersona;

    public TipoSuv(double porcenSeguroPer,
            Comprador propie, String mar, double preBase) {
        super(propie, mar, preBase);
        porcentajeSeguroPersona = porcenSeguroPer;

    }

    public void establecerPorcentajeSeguroPersona(double c) {
        porcentajeSeguroPersona = c;
    }

    public void establecerSeguroPersona() {
        seguroPersona = (porcentajeSeguroPersona / 100) * precioBase;

    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroPersona;
    }

    public double obtenerPorcentajeSeguroPersona() {
        return porcentajeSeguroPersona;
    }

    public double obtenerSeguroPersona() {
        return seguroPersona;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo Suv:\n"
                + "Comprador: \n%s\n"
                + "\tPorcentaje del Seguro de la Persona: %.2f%%\n"
                + "\tSeguro de la Persona: %.2f\n"
                + "\tPrecio Base: $%.2f\n"
                + "\tPrecio Final: $%.2f\n",
                propietario.toString(),
                obtenerPorcentajeSeguroPersona(),
                obtenerSeguroPersona(),
                obtenerPrecioBase(),
                obtenerPrecioFinal());
        return cadena;
    }
}
