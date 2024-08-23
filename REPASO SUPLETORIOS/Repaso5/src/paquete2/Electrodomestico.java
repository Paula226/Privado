/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public abstract class Electrodomestico {
   protected String marca;
   protected double potencia;
   protected double horaUso;
   protected double consumo;

    public Electrodomestico(String mar, double poten, double horUso) {
        marca = mar;
        potencia = poten;
        horaUso = horUso;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerPotencia(double c) {
        potencia = c;
    }

    public void establecerHoraUso(double c) {
        horaUso = c;
    }

    public abstract void establecerConsumo();

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPotencia() {
        return potencia;
    }

    public double obtenerHoraUso() {
        return horaUso;
    }

    public double obtenerConsumo() {
        return consumo;
    }
   @Override
   public String toString() {
       String cadena = String.format("Marca: %s\n"
               + "\tPotencia: %.2f\n"
               + "\tHora de Uso: %.2f\n",
               obtenerMarca(),
               obtenerPotencia(),
               obtenerHoraUso());
       return cadena;
   }
   
}
