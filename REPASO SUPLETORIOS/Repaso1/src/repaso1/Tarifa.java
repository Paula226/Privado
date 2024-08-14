/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author Paula Lopez
 */
public class Tarifa {
   private Persona persona;
   private double tarifa;
   private boolean finSemana;
   

    public Tarifa(Persona per, boolean fin) {
        persona = per;
        tarifa = 0;
        finSemana = fin;
    }
     public void establecerPersona(Persona c) {
        persona = c;
    }
    public void establecerTarifa(double c) {
        tarifa = c;
    }
    
   public void establecerTarifa() {
       if (persona.obtenerEdad() > 12) {
           tarifa = 3;
       }else {
           tarifa = 1.5;
            
       }
       if (finSemana) {
           tarifa += 0.5;
           
       }
   }
    public Persona obtenerPersona() {
        return persona;
    }

    public double obtenerTarifa() {
        return tarifa;
    } 
}
