/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author Paula Lopez
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamo;
    private double numeroMeses;
    private double descuento;
    private double pagoBase;

    public PrestamoEducativo(String niEstudio, InstitucionEducativa cenEducativo,
            double valCarrera, double numMeses, Persona benefici, double tiemPrestamo, String cuiPrestamo) {
        super(benefici, tiemPrestamo, cuiPrestamo);
        nivelEstudio = niEstudio;
        centroEducativo = cenEducativo;
        valorCarrera = valCarrera;
        numeroMeses = numMeses;
    }

    

    public void establecerNivelEstudio(String c) {
        nivelEstudio = c;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerValorCarrera(double c) {
        valorCarrera = c;
    }

    public void establecerValorMensualPrestamo() {
        valorMensualPrestamo = pagoBase - descuento ;
    }

    public void establecerNumeroMeses(double c) {
        numeroMeses = c;
    }

    public void establecerDescuento() {
        descuento = pagoBase * 0.10;
    }

    public void establecerPagoBase() {
        pagoBase = valorCarrera/numeroMeses;
    }

    @Override
    public void establecerCuidadPrestamo(String c) {
        cuidadPrestamo = c.toUpperCase(); // para mayuscula
    }
    

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualPrestamo() {
        return valorMensualPrestamo;
    }

    public double obtenerNumeroMeses() {
        return numeroMeses;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public double obtenerPagoBase() {
        return pagoBase;
    }
    
 @Override
    public String toString() {
        String cadena = String.format("\n----> PRESTAMO EDUCATIVO <--------\n"
                + "%s\n"
                + "Nivel de Estudio: %s\n"
                + "Centro Educativo: \n"
                + "\tNombre del centro educativo: %s\n"
                + "\tSiglas del centro educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Descuento: %.2f\n"
                + "Valor mensual del pago prestamo: %.2f\n",
                super.toString(),
                centroEducativo.obtenerNombre(),
                centroEducativo.obtenerSiglas(),
                obtenerValorCarrera(),
                obtenerDescuento(),
                obtenerValorMensualPrestamo());
        return cadena;
                
}
   
}
