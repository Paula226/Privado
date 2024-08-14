/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author Paula Lopez
 */
public class Adulto extends Persona {

    private Telefono telefono;

    public Adulto(Telefono telef, String n, int e, String ce) {
        super(n, e, ce);
        telefono = telef;
    }

    public void establecerTelefono(Telefono telefono) {
        telefono = telefono;
    }

    public Telefono obtenerTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Edad: %d\n"
                + "Cedula: %s\n"
                + "Telefono: %s\n",
                obtenerNombre(),
                obtenerEdad(),
                obtenerCedula(),
                telefono.obtenerNumero());
        return cadena;

    }

}
