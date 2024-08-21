/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author Paula Lopez
 */
public class Prestamo {
    protected Persona beneficiario;
    protected double tiempoPrestamo;
    protected String cuidadPrestamo;

    public Prestamo(Persona benefici, double tiemPrestamo, String cuiPrestamo) {
        beneficiario = benefici;
        tiempoPrestamo = tiemPrestamo;
        cuidadPrestamo = cuiPrestamo;
    }

    public void establecerBeneficiario(Persona c) {
        beneficiario = c;
    }

    public void establecerTiempoPrestamo(double c) {
        tiempoPrestamo = c;
    }

    public void establecerCuidadPrestamo(String c) {
        cuidadPrestamo = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public double obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCuidadPrestamo() {
        return cuidadPrestamo;
    }
    
     @Override
    public String toString() {
        String cadena = String.format("\nBeneficiario: \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n"
                + "\tTiempo de Prestamo en un mes: %.2f\n"
                + "\tCuidad: %s\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerIdentificacion(),
                obtenerTiempoPrestamo(),
                obtenerCuidadPrestamo());
        return cadena;
    }
}
