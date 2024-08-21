/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

import java.util.Scanner;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 para Docente Nombramiento o"
                + " 2 para Docente Fctura");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el Nombre");
        String nom = sc.nextLine();

        System.out.println("Ingrese los Apellidos");
        String apelli = sc.nextLine();

        System.out.println("Ingrese la identificacion");
        String identifi = sc.nextLine();

        System.out.println("Ingrese el Area");
        String are = sc.nextLine();
        switch (n) {
            case 1:
                System.out.println("Ingrese los datos de Docente Nombramiento");
                System.out.println("Ingrese el Salario Base: ");
                double salariBase = sc.nextDouble();

                System.out.println("Ingrese las horas extras: ");
                double horExtra = sc.nextDouble();

                System.out.println("Ingrses el valor por Hora: ");
                double valFijoHora = sc.nextDouble();

                DocenteNombramiento d1 = new DocenteNombramiento(salariBase,
                      horExtra, valFijoHora, nom, apelli,identifi, are);
                d1.establecerNombre(nom);
                d1.establecerApellidos(apelli);
                d1.establecerIdentificacion(identifi);
                d1.establecerArea(are);
                d1.establecerSalarioBase(salariBase);
                d1.establecerHoraExtra(horExtra);
                d1.establecerValorFijoHora(valFijoHora);
                d1.establecerSueldoAdicional();
                d1.establecerSueldoMensual();
                System.out.println(d1);

                break;
            case 2:
                double iv;
                double valorFact;
                System.out.println("Ingrese los datos de Docente Factura");
                System.out.println("Ingrese el Iva:");
                iv = sc.nextDouble();
                System.out.println("Ingrese el Valor de la factura: ");
                valorFact = sc.nextDouble();
                DocenteFactura d2 = new DocenteFactura( nom, apelli, identifi,
                 are,  iv,  valorFact);
                d2.establecerNombre(nom);
                d2.establecerApellidos(apelli);
                d2.establecerIdentificacion(identifi);
                d2.establecerArea(are);
                d2.establecerIva(iv);
                d2.establecerValorFactura(valorFact);
                d2.establecerValorDescontado();
                d2.establecerValorFinal();
                System.out.println(d2);
                break;
            default:
                System.out.println("Error, opción no válida");
        }

    }

}
