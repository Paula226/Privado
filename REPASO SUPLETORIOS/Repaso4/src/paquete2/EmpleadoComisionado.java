/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class EmpleadoComisionado extends Empleado {

    private double ventasTotales;
    private double porcentajeComision;

    public EmpleadoComisionado( String nom, String ide, double salarioB, double ventTotales,
            double porcenComision) {
        super(nom, ide, salarioB);
        ventasTotales = ventTotales;
        porcentajeComision = porcenComision;
    }

    public void establecerVentasTotales(double c) {
        ventasTotales = c;
    }

    public void establecerPorcentajeComision(double c) {
        porcentajeComision = c;
    }

    @Override
    public void establecerSalarioTotal() {
        salarioTotal = obtenerSalarioBase() + (ventasTotales * porcentajeComision);
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerPorcentajeComision() {
        return porcentajeComision;
    }

    @Override
    public double obtenerSalarioTotal() {
        return salarioTotal;
    }

    @Override
    public String toString() {
        establecerSalarioTotal();
        String cadena = String.format("Empleado Comisionado\n"
                + "%s\n"
                + "\tVentas Totales: %.2f\n"
                + "\tPrcentaje Comision: %.2f\n"
                + "\t Salario Total: %.2f\n",
                super.toString(),
                obtenerVentasTotales(),
                obtenerVentasTotales(),
                obtenerPorcentajeComision(),
                obtenerSalarioTotal());
        return cadena;
    }
}
