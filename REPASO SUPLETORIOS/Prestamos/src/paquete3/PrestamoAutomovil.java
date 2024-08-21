/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author Paula Lopez
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marca;
    private Persona garante1;
    private double valor;
    private double valorMesualPrestamo;

    public PrestamoAutomovil(String tipAutomovil, String marc, Persona garan1, 
            double val, double valMesuPrest, Persona benefici, double tiemPrestamo, String cuiPrestamo) {
        super(benefici, tiemPrestamo, cuiPrestamo);
        tipoAutomovil = tipAutomovil;
        marca = marc;
        garante1 = garan1;
        valor = val;
        valorMesualPrestamo = valMesuPrest;
    }

    public void establecerTipoAutomovil(String c) {
        tipoAutomovil = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerGarante1(Persona c) {
        garante1 = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void establecerValorMesualPrestamo() {
        valorMesualPrestamo = valor / tiempoPrestamo ;
    }

    @Override
    public void establecerCuidadPrestamo(String c) {
       cuidadPrestamo = c.toLowerCase(); /// es para que sea en minuscula
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMesualPrestamo() {
        return valorMesualPrestamo;
    }
     @Override
    public String toString() {
        String cadena = String.format("\n----> PRESTAMO AUTOMOVIL <--------\n"
                + "%s\n"
                + "Tipo de Automovil: %s\n"
                + "Marca: %s\n"
                + "Garante: %s\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tIdentificacion: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Pago: %.2f\n",
                super.toString(),
                obtenerTipoAutomovil(),
                obtenerMarca(),
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                garante1.obtenerIdentificacion(),
                obtenerValor(),
                obtenerValorMesualPrestamo());
        return cadena;
    }      
}
