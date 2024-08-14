/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class TipoSedan extends Vehiculo  {
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(double porcenDescu,
            Comprador propie, String mar, double preBase) {
        super(propie, mar, preBase);
        porcentajeDescuento = porcenDescu;
        
    }
    public void establecerPorcentajeDescuento(double c){
        porcentajeDescuento = c;
    }
    public void establecerValorDescuento() {
        valorDescuento = (porcentajeDescuento/100) * precioBase;
        
    }
    public void establecerSeguroMecanico() {
        seguroMecanico = 0.01 * precioBase;
    }

    @Override
    public void establecerPrecioFinal() {
       precioFinal =  precioBase - valorDescuento + seguroMecanico;
    }
    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public double obtenerValorDescuento() {
        return valorDescuento;
    }
    public double obtenerSeguroMecanico(){
       return seguroMecanico; 
    }     
    public String toString() {
        String cadena = String.format("Tipo Sedan:\n"
                + "Comprador: \n%s\n"
                + "Porcentaje de Descuento: %.2f\n"
                + "Valor de Descuento: %.2f\n"
                + "Seguro Mecanico: %.2f"
                + "\tPrecio Base: $%.2f\n"
                + "\tPrecio Final:$%.2f\n",
                propietario.toString(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguroMecanico(),
                obtenerPrecioBase(),
                obtenerPrecioFinal());
        return cadena;
}
}
