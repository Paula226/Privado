/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Empleado;
import paquete2.EmpleadoAsalariado;
import paquete2.EmpleadoComisionado;
import paquete2.EmpleadoPorHora;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el tipo de Empleado que desea");
            System.out.println("<1> Empleado Asalariado");
            System.out.println("<2> Empleado Comisionado");
            System.out.println("<3> Empleado por Hora");
            System.out.println("<0> Terminar y mostrar resultados ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nom1 = sc.nextLine();

                    System.out.println("Ingrese identificación: ");
                    String ide1 = sc.nextLine();

                    System.out.println("Ingrese Salario Base: ");
                    double sal1 = sc.nextDouble();

                    System.out.println("Ingrese Bono Anual: ");
                    double bon1 = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea

                    EmpleadoAsalariado empleadoA = new EmpleadoAsalariado(nom1, ide1,
                            sal1, bon1);
                    listaEmpleado.add(empleadoA);

                    break;
                case 2:
                    System.out.println("Ingrese el nombre: ");
                    String nom2 = sc.nextLine();

                    System.out.println("Ingrese identificación: ");
                    String ide2 = sc.nextLine();

                    System.out.println("Ingrese Salario Base: ");
                    double sal2 = sc.nextDouble();

                    System.out.println("Ingrese Ventas Totales: ");
                    double ventas2 = sc.nextDouble();

                    System.out.println("Ingrese porcentaje Comisión: ");
                    double porcen2 = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea

                    EmpleadoComisionado empleadoC = new EmpleadoComisionado(nom2,
                            ide2, sal2, ventas2, porcen2);

                    listaEmpleado.add(empleadoC);

                    break;
                case 3:
                    System.out.println("Ingrese el nombre: ");
                    String nom3 = sc.nextLine();

                    System.out.println("Ingrese identificación: ");
                    String ide3 = sc.nextLine();

                    System.out.println("Ingrese Salario Base: ");
                    double sal3 = sc.nextDouble();

                    System.out.println("Ingrese las horas Trabajadas: ");
                    double horas3 = sc.nextDouble();

                    System.out.println("Ingrese la tarifa por hora: ");
                    double tarifa3 = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea

                    EmpleadoPorHora empleadoH = new EmpleadoPorHora(nom3,
                            ide3, sal3, horas3, tarifa3);
                    listaEmpleado.add(empleadoH);

                    break;
                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo");
                    break;
            }
        }

        for (int i = 0; i < listaEmpleado.size(); i++) {
            listaEmpleado.get(i).establecerSalarioTotal(); // Asegúrate de que este método esté correctamente implementado
            System.out.println(listaEmpleado.get(i)); // Llama al método toString() para imprimir la información del empleado
            System.out.println(); // Espacio en blanco entre empleados
        }

        sc.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}
