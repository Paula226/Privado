/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class Refrigerador extends Electrodomestico {

    private boolean ahorroEnergia;

    public Refrigerador(String mar, double poten, double horUso,
            boolean ahorroEner) {
        super(mar, poten, horUso);
        ahorroEnergia = ahorroEner;
    }

    public void estblecerAhorroEnergia(boolean c) {
        ahorroEnergia = c;
    }

    @Override
    public void establecerConsumo() {
        if (ahorroEnergia) {
            consumo = (potencia * horaUso) * 0.9;

        } else {
            consumo = potencia * horaUso;
        }
    }

    public boolean obtenerAhorroEnergia() {
        return ahorroEnergia;
    }

    @Override
    public double obtenerConsumo() {
        return consumo;
    }

    public String toString() {
        establecerConsumo();
        String cadena = String.format("Datos del Refrigerador\n"
                + "%s\n"
                + "\tAhorro de energia: %b\n"
                + "\tConsumo: %.2f\n",
                super.toString(),
                obtenerAhorroEnergia(),
                obtenerConsumo());
        return cadena;
    }

}
