/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Empleado;
import paquete2.EmpleadoAsalariado;
import paquete2.EmpleadoComisionado;
import paquete2.EmpleadoPorHora;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        EmpleadoAsalariado empleadoA = new EmpleadoAsalariado("Sergio",
                "110445478", 2500, 6000);
        
        empleados.add(empleadoA);
        
        EmpleadoComisionado empleadoC = new EmpleadoComisionado(
                "Paula", "11550038875", 200,20,0.10);
        empleados.add(empleadoC);
        
        EmpleadoPorHora empleadoH = new EmpleadoPorHora(
                "Mora", "1150033878", 250, 3, 20);
        empleados.add(empleadoH);
        
        for (int i = 0; i < empleados.size(); i++) {
            empleados.get(i).establecerSalarioTotal();
            System.out.println(empleados.get(i));
            System.out.println();
            
        }
        
    }
    
}
