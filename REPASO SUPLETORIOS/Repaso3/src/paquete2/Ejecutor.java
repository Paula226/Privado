/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {
    public static void main(String[] args) {
        ArrayList<Trabajador> listaTrabajadores = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String bandera = "";
                 
        do {
            
            System.out.println("Ingrese su nombre:\n");
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese su cedula:\n");
            String cedula = sc.nextLine();
            
            System.out.println("Ingrese su correo:\n");
            String correo = sc.nextLine();
           
            System.out.println("Ingrese el sueldo:\n");
            double sueldo = sc.nextDouble();
            
            System.out.println("Ingrese el mes sueldo:\n");
            double mesSueldo = sc.nextDouble();
            
            System.out.println("Ingrese descuento de Seguro:\n");
            double desSeguro = sc.nextDouble();
            
            sc.nextLine(); // limpieza 
            Trabajador trabajo1 = new Trabajador(nombre, cedula, 
                    correo, sueldo,mesSueldo, desSeguro);
            trabajo1.establecerPorcentajeDescuentoSeguro();
            trabajo1.establecerSueldoFinal();
            
            listaTrabajadores.add(trabajo1);
            
            System.out.println("Desea ingresar datos si/no");
            bandera = sc.nextLine();
            
        } while (bandera.equalsIgnoreCase("si"));
                 // se utiliza para las cadenas 
        
        ListaTrabajadores list1 = new ListaTrabajadores(listaTrabajadores);
        list1.establecerSueldoTotales();
        System.out.println(list1);
    }
    
}
