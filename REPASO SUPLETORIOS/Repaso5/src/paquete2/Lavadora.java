/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class Lavadora extends Electrodomestico {

    private double factorEspecifico;

    public Lavadora(String mar, double poten, double horUso, double factEspecifico) {
        super(mar, poten, horUso);
        factorEspecifico = factEspecifico;
    }

    public void establecerFactorEspecifico(double c) {
        factorEspecifico = c;
    }

    @Override
    public void establecerConsumo() {
        consumo = (potencia * horaUso) * factorEspecifico;
    }

    public double obtenerFactorEspecifico() {
        return factorEspecifico;
    }

    @Override
    public double obtenerConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        establecerConsumo();
        String cadena = String.format("Datos de la Lavadora\n"
                + "%s\n"
                + "\tFactor Especifico: %.2f\n"
                + "\tConsumo: %.2f\n",
                super.toString(),
                obtenerFactorEspecifico(),
                obtenerConsumo());
        return cadena;
    }
}
