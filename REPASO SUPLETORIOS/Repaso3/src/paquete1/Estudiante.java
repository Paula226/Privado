/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class Estudiante {

    private String nombre;
    private double califi1;
    private double califi2;
    private double califi3;
    private double promedio;

    public Estudiante(String nom, double cali1, double cali2, double cali3) {
        nombre = nom;
        califi1 = cali1;
        califi2 = cali2;
        califi3 = cali3;
     
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCalifi1(double c) {
        califi1 = c;
    }

    public void establecerCalifi2(double c) {
        califi2 = c;
    }

    public void establecerCalifi3(double c) {
        califi3 = c;
    }

    public void establecerPromedio(double c) {
        promedio = (califi1 + califi2 + califi3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalifi1() {
        return califi1;
    }

    public double obtenerCalifi2() {
        return califi2;
    }

    public double obtenerCalifi3() {
        return califi3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "\tCalificacion 1: %.2f\n"
                + "\tCalificacion 2: %.2f\n"
                + "\tCalificacion 3: %.2f\n"
                + "\tPromedio: %.2f\n",
                obtenerNombre(),
                obtenerCalifi1(),
                obtenerCalifi2(),
                obtenerCalifi3(),
                obtenerPromedio());
        return cadena;
    }
}