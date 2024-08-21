/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Paula Lopez
 */
public class Docente {
    protected String nombre;
    protected String apellidos;
    protected String identificacion;
    protected String area;

    public Docente(String nom, String apelli, String identifi, String are) {
        nombre = nom;
        apellidos = apelli;
        identificacion = identifi;
        area = are;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellidos(String c) {
        apellidos = c;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public void establecerArea(String c) {
        area = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerArea() {
        return area;
    }
    @Override
    public String toString() {
        String cadena = String.format("Datos\n"
                + "Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Area: %s\n", 
                obtenerNombre(),
                obtenerApellidos(),
                obtenerIdentificacion(),
                obtenerArea());
        return cadena;
    } 
    
}
