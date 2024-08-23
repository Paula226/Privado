/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Paula Lopez
 */
public class EmpleadoPorHora extends Empleado {
  private double horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHora( String nom, String ide, double salarioB, double horTrabajadas, double tarHora) {
        super(nom, ide, salarioB);
        horasTrabajadas = horTrabajadas;
        tarifaHora = tarHora;
    }

    public void establecerHorasTrabajadas(double c) {
        horasTrabajadas = c;
    }

    public void establecerTarifaHora(double c) {
        tarifaHora = c;
    }

    @Override
    public void establecerSalarioTotal() {
        salarioTotal = (horasTrabajadas * tarifaHora)
                + obtenerSalarioBase();
    }

    public double obtenerHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double obtenerTarifaHora() {
        return tarifaHora;
    }

    @Override
    public double obtenerSalarioTotal() {
        return salarioTotal;
    }
    
    @Override
    public String toString(){
        establecerSalarioTotal();
        String cadena = String.format("Empleado Por Hora\n"
                + "%s\n"
                + "\tHoras Trbajadas: %.2f\n"
                + "\tTarifa por Hora: %.2f\n"
                + "\tSalario Total: %.2f", 
                super.toString(),
                obtenerHorasTrabajadas(),
                obtenerTarifaHora(),
                obtenerSalarioTotal());
        return cadena;
    }
}

