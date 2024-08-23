/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class Televisor extends Electrodomestico {
    private String resolucion;

    public Televisor( String mar, double poten, double horUso,String resolu) {
        super(mar, poten, horUso);
        resolucion = resolu;
    }

    public void establecerResolucion(String c) {
        resolucion = c;
    }
 @Override
    public void establecerConsumo() {
        switch (resolucion) {
         case "4k":
             consumo = potencia * horaUso * 1.2;
             
             break;
         case "Full HD":
             consumo = potencia * horaUso * 1.1;
         default:
             consumo = potencia * horaUso;
     }
    }
    public String obtenerResolucion() {
        return resolucion;
    }

    @Override
    public double obtenerConsumo() {
        return consumo;
    }
 @Override
    public String toString() {
        establecerConsumo();
        String cadena = String.format("Datos del Telivisor\n"
                + "%s\n"
                + "\tResolucion: %s\n"
                + "\tConsumo: %.2f\n",
                super.toString(),
                obtenerResolucion(),
                obtenerConsumo());
        return cadena;
    }

}
