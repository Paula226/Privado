/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class EmpleadoAsalariado extends Empleado{
    private double bonoAnual;

    public EmpleadoAsalariado(String nom, String ide, double salarioB, double bonAnual) {
        super(nom, ide, salarioB);
        bonoAnual = bonAnual;
    }

    public void establecerBonoAnual(double c) {
        bonoAnual = c;
    }
    @Override
     public void establecerSalarioTotal(){
         salarioTotal = obtenerSalarioBase()+(bonoAnual/12);
    }  
    public double obtenerBonoAnual() {
        return bonoAnual;
    }

    @Override
    public double obtenerSalarioTotal() {
        return salarioTotal;
    }
    
    @Override
    public String toString(){
        establecerSalarioTotal();
        String cadena = String.format("Empleado Asalariado\n"
                + "%s\n"
                + "\tBono Anual: %.2f\n"
                + "\tSalario Total: %.2f", 
                super.toString(),
                obtenerBonoAnual(),
                obtenerSalarioTotal());
        return cadena;
    }
}
