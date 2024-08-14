/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author Paula Lopez
 */
public class Persona {

    private String nombre;
    private int edad;
    private String cedula;

    public Persona(String n, int e, String ce) {
        nombre = n;
        edad = e;
        cedula = ce;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCedula() {
        return cedula;
    }

}
