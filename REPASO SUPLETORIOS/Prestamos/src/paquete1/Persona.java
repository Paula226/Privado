/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class Persona {

private String nombre;
private String apellido;
private String identificacion;

    public Persona(String nom, String ape, String ide) {
        nombre = nom;
        apellido = ape;
        identificacion = ide;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
  
    
}
