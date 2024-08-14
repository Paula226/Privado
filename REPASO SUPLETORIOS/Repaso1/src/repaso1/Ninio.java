/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author Paula Lopez
 */
public class Ninio extends Persona {

    private Adulto representante;

    public Ninio(Adulto repre, String n, int e, String ce) {
        super(n, e, ce);
        representante = repre;
    }

    public void establecerRepresentante(Adulto c) {
        representante = c;
    }

    public Adulto obtenerRepresentante() {
        return representante;
    }

    @Override
    public String toString() {
        String cadena = String.format("Representante\n"
                + "%s\n"
                + "INFORMACION DEL MENOR DE EDAD\n"
                + "Nombre: %s\n"
                + "Edad: %d \n"
                + "Cedula: %s\n",
                representante.toString(),
                obtenerNombre(),
                obtenerEdad(),
                obtenerCedula());
                
        return cadena;

    }

}
