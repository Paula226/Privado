/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Paula Lopez
 */
public class DocenteNombramiento extends Docente{
    private double salarioBase;
    private double horaExtra;
    private double valorFijoHora;
    private double sueldoMensual;
    private double sueldoAdicional;

    DocenteNombramiento(double salariBase, double horExtra,
            double valFijoHora, String nom, String apelli, 
            String identifi, String are) {
        super(nom, apelli, identifi, are);
        salarioBase = salariBase;
        horaExtra = horExtra;
        valorFijoHora = valFijoHora;
        
    }

   
    

    public void establecerSalarioBase(double c) {
        salarioBase = c;
    }

    public void establecerHoraExtra(double c) {
        horaExtra = c;
    }

    public void establecerValorFijoHora(double c) {
        valorFijoHora = c;
    }

    public void establecerSueldoMensual() {
        sueldoMensual = salarioBase + sueldoAdicional;
    }

    public void establecerSueldoAdicional() {
        sueldoAdicional = valorFijoHora + horaExtra;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public double obtenerHoraExtra() {
        return horaExtra;
    }

    public double obtenerValorFijoHora() {
        return valorFijoHora;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    public double obtenerSueldoAdicional() {
        return sueldoAdicional;
    }
       @Override
    public String toString(){
        String cadena = String.format("Docente Factura\n"
                + "Nombre: %s\n"
                + "Apellidos %s\n"
                + "Identificacion: %s\n"
                + "Area: %s\n"
                + "\tSalario Base: %.2f\n"
                + "\tHora Extra: %.2f\n"
                + "\tValor Fijo Hora: %.2f\n"
                + "\tSueldo Mensual: %.2f\n"
                + "\tSueldo Adicional: %.2f\n",
                obtenerNombre(),
                obtenerApellidos(),
                obtenerIdentificacion(),
                obtenerArea(),
                obtenerSalarioBase(),
                obtenerHoraExtra(),
                obtenerValorFijoHora(),
                obtenerSueldoMensual(), 
                obtenerSueldoAdicional());
                return cadena;
    }
}
