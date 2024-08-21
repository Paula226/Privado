/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.Arriendo;

/**
 *
 * @author Paula Lopez
 */
public class ArriendoLocalSesiones extends Arriendo {

    protected double valorSillas;
    protected double valorAmplificacion;

    public ArriendoLocalSesiones(String nombre,
            double cuotaBas) {
        super(nombre, cuotaBas);

    }

    public void establecerValorSillas(double c) {
        valorSillas = c;
    }

    public void establecerValorAmplificacion(double c) {
        valorAmplificacion = c;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = obtenerCuotaBase() + obtenerValorSillas()
                + obtenerValorAmplificacion();
    }

    public double obtenerValorSillas() {
        return valorSillas;
    }

    public double obtenerValorAmplificacion() {
        return valorAmplificacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Arriendo de Local Sesiones\n"
                + "\tNombre Arrendatario: %s\n"
                + "\tCuota Base :%.2f\n"
                + "\tValor Sillas: %.2f\n"
                + "\tValor Amplificacion: %.2f\n"
                + "\tArriendo Total: %.2f\n",
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorSillas(),
                obtenerValorAmplificacion(),
                obtenerArriendoMensual());
        return cadena;
    }

}
