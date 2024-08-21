/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nom, String sig) {
        nombre = nom;
        siglas = sig;
    }

    public void establecerNombre(String c) {
       nombre = c;
    }

    public void establecerSiglas(String c) {
        siglas = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    
    
}
