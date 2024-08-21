/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Paula Lopez
 */
public class DocenteFactura extends Docente{
    private double iva;
    private double valorFactura;
    private double valorDescontado;
    private double valorFinal;

    DocenteFactura( String nom, String apelli, String identifi,
            String are, double iv, double valorFact) {
        super(nom, apelli, identifi, are);
        iva = iv;
        valorFactura = valorFact;
       
    }

    public void establecerIva(double c) {
        iva = c;
    }

    public void establecerValorFactura(double c) {
        valorFactura = c;
    }

    public void establecerValorDescontado() {
        valorDescontado = valorFactura * (iva/100);
    }

    public void establecerValorFinal() {
        valorFinal = valorFinal + valorDescontado;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorDescontado() {
        return valorDescontado;
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }
    @Override
    public String toString(){
        String cadena = String.format("Docente Factura\n"
                + "Nombre: %s\n"
                + "Apellidos %s\n"
                + "Identificacion: %s\n"
                + "Area: %s\n"
                + "\tIva: %.2f\n"
                + "\tValor Factura: %.2f\n"
                + "\tValor Descontado: %.2f\n"
                + "\tValor Final: %.2f\n", 
                obtenerNombre(),
                obtenerApellidos(),
                obtenerIdentificacion(),
                obtenerArea(),
                obtenerIva(),
                obtenerValorFactura(),
                obtenerValorDescontado(),
                obtenerValorFinal());
        return cadena;
    }
    
}
