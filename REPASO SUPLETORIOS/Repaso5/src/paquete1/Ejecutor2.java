/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Electrodomestico;
import paquete2.Lavadora;
import paquete2.Refrigerador;
import paquete2.Televisor;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Electrodomestico> listaElectros = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {

            System.out.println("Ingrese el tipo de Electrodomestico");
            System.out.println("<1> Lavadora");
            System.out.println("<2> Refrigerador");
            System.out.println("<3> Televisor");
            System.out.println("<0> Terminar y mostar resultados");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la marca: ");
                    String mar1 = sc.nextLine();

                    System.out.println("Ingrese la potencia: ");
                    double pon1 = sc.nextDouble();

                    System.out.println("Ingrese las Horas de Uso: ");
                    double horas1 = sc.nextDouble();

                    System.out.println("Ingrese el factor especifico: ");
                    double fac1 = sc.nextDouble();
                    sc.nextLine();

                    Lavadora lav1 = new Lavadora(mar1, pon1, horas1,
                            fac1);

                    listaElectros.add(lav1);

                    System.out.println("Lavadora ingresada: " + lav1);
                    break;
                case 2:
                    System.out.println("Ingrese la marca: ");
                    String mar2 = sc.nextLine();

                    System.out.println("Ingrese la potencia: ");
                    double pon2 = sc.nextDouble();

                    System.out.println("Ingrese las Horas de Uso: ");
                    double horas2 = sc.nextDouble();
                    sc.nextLine();
                    // Modificar esta parte para evitar el error
                    System.out.println("Tiene ahorro de energia (si/no): ");
                    String ahorroEnergiaTexto = sc.nextLine();
                    boolean ahorroE2 = ahorroEnergiaTexto.equalsIgnoreCase("si");

                    Refrigerador ref1 = new Refrigerador(mar2, pon2,
                            horas2, ahorroE2);
                    listaElectros.add(ref1);
                    System.out.println(ref1);
                    break;

                case 3:
                    System.out.println("Ingrese la marca: ");
                    String mar3 = sc.nextLine();

                    System.out.println("Ingrese la potencia: ");
                    double pon3 = sc.nextDouble();

                    System.out.println("Ingrese las Horas de Uso: ");
                    double horas3 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese su resolucion:\n"
                            + "4K\n"
                            + "Full HD\n"
                            + "HD - deje en blanco\n");
                    String resol3 = sc.nextLine();

                    Televisor tel3 = new Televisor(mar3, pon3,
                            horas3, resol3);
                    listaElectros.add(tel3);
                    System.out.println(tel3);
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }
        }

        System.out.println("\n--- Resumen de Electrodomésticos Ingresados ---");
        for (int i = 0; i < listaElectros.size(); i++) {
           
            System.out.println(listaElectros.get(i));
            System.out.println();
        }
    }
}

