/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 Generar un programa que permita ingresar por teclado información que 
 * corresponde a sueldos de trabajadores. Por cada trabajador ingresar: 
 * cédula, nombres, correo, sueldo, mes del sueldo, descuento de seguro,
 * porcentaje de descuento del seguro, sueldo final a pagar
 * La información debe quedar registrada en un base de datos.

El proceso de ingreso es iterativo hasta que el usuario decida lo contrario.

Al final se presentar los registros ingresados en la base de datos
 */
public class Trabajador {
    public String nombre;
    public String cedula;
    public String correo;
    public double sueldo;
    public double mesSueldo;
    public double descuentoSeguro;
    public double porcentajeDesSeguro;
    public double sueldoFinal;

    public Trabajador(String nom, String cedu, String corre, double suel,
            double mesSuel, double desSeguro) {
        nombre = nom;
        cedula = cedu;
        correo = corre;
        sueldo = suel;
        mesSueldo = mesSuel;
        descuentoSeguro = desSeguro;
        
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }
    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void establecerMesSueldo(double c) {
        mesSueldo = c;
    }

    public void establecerDescuentoSeguro(double c) {
        descuentoSeguro = c;
    }

    public void establecerPorcentajeDescuentoSeguro() {
        porcentajeDesSeguro = descuentoSeguro/100;
    }

    public void establecerSueldoFinal() {
        sueldoFinal =  mesSueldo - porcentajeDesSeguro;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerMesSueldo() {
        return mesSueldo;
    }

    public double obtenerDescuentoSeguro() {
        return descuentoSeguro;
    }

    public double obtenerPorcentajeDesSeguro() {
        return porcentajeDesSeguro;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos del Trabajador\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Correo: %s\n"
                + "\tSueldo: %.2f\n"
                + "\tMes Sueldo: %.2f\n"
                + "\tDescuento Seguro: %.2f\n"
                + "\tPorcentaje Descuento Seguro: %.2f\n"
                + "\tSueldo Final: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo(),
                obtenerDescuentoSeguro(),
                obtenerPorcentajeDesSeguro(),
                obtenerSueldoFinal());
        return cadena;
    }
}
