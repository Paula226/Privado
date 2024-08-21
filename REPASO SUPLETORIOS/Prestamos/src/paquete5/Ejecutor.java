/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import java.util.ArrayList;
import java.util.Scanner;
import paquete1.InstitucionEducativa;
import paquete1.Persona;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<PrestamoAutomovil> listaAutomovil = new ArrayList<>();
        ArrayList<PrestamoEducativo> listaEducativo = new ArrayList<>();
        String respuesta;
        int opcion;

        do {
            System.out.println("-----Menu-------");
            System.out.println("""
                               <1> Prestamo Automovil
                               <2> Prestamo Educativo
                               """);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->  {
                    System.out.println("Ingrese los datos para el prestamo "
                            + "del automovil");
                    System.out.print("\tNombre del beneficiario: ");
                    String nomBene = sc.nextLine();

                    System.out.print("\tApellidos: ");
                    String apellidoBene = sc.nextLine();

                    System.out.print("\tIdentificacion: ");
                    String ideBene = sc.nextLine();

                    System.out.println("---------------------------");

                    Persona beneficiario = new Persona(nomBene,
                            ideBene, ideBene);
                    
                    System.out.print("\tTiempo de prestamo en meses: ");
                    double tiempoPresMes = sc.nextDouble();
                    sc.nextLine();
                    
                    System.out.print("\tCuidad del prestamo: ");
                    String cuidadPres = sc.nextLine();
                    System.out.println("-------------------------");
                    
                    System.out.print("\t Tipo Automovil: ");
                    String tipoAuto = sc.nextLine();
                    
                    System.out.print("Marca del Automovil: ");
                    String marcaAuto = sc.nextLine();
                    
                    System.out.println("-------------------------------");
                    
                    System.out.print("\tNombre del Garate: ");
                    String nomGarante = sc.nextLine();
                    
                    System.out.print("Apellido del Garante: ");
                    String apeGrant = sc.nextLine();
                    
                    System.out.print("\tIdentificacion del Garante: ");
                    String ideGarante = sc.nextLine();
                    
                    System.out.println("------------------------------------");
                    
                    Persona garante = new Persona(nomGarante, apeGrant, 
                            ideGarante);
                    
                    System.out.print("\n\tValor del Automovil: ");
                    double valAutomovil = sc.nextDouble();
                    sc.nextLine();
                    
                    PrestamoAutomovil presAuto = new PrestamoAutomovil(
                            tipoAuto, marcaAuto, garante, 
                            valAutomovil, valAutomovil, 
                            beneficiario, tiempoPresMes,
                            cuidadPres);
                    presAuto.establecerCuidadPrestamo(cuidadPres);
                    presAuto.establecerValorMesualPrestamo();
                    
                    listaAutomovil.add(presAuto);
                }
                case 2 -> {
                    System.out.println("Ingrese los datos para el prestamo Educativo:");
                    System.out.print("\tNombre deel beneficiario: ");
                    String nombreBene = sc.nextLine();
                    
                    System.out.print("\tApellido del Beneficiario: ");
                    String apelliBene = sc.nextLine();
                    
                    System.out.print("\tIdentificaion del Beneficiario: ");
                    String ideBenef = sc.nextLine();
                    
                    System.out.println("---------------------------------------");
                    
                    Persona beneficiario2 = new Persona(nombreBene, 
                            apelliBene, ideBenef);
                    
                    System.out.print("\tTiempo de prestamo en meses: ");
                    double tiempoMes = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("\t Cuidad del Prestamo: ");
                    String cuidadPres = sc.nextLine();
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.print("\tNivel de estudio: ");
                    String nivelEstu = sc.nextLine();
                    
                    System.out.print("\tNombre del Centro Educativo: ");
                    String nomEdu = sc.nextLine();
                    
                    System.out.print("\tSiglas del centro Educacion: ");
                    String siglaEdu = sc.nextLine();
                    
                    InstitucionEducativa institucion = new InstitucionEducativa(
                            nomEdu, siglaEdu);
                    
                    System.out.print("\n\tValor de la carrera: $");
                    double valorCarrera = sc.nextDouble();
                    System.out.print("\tNumero de meses: ");
                    double numMeses = sc.nextDouble();
                    sc.nextLine();
                    
                    PrestamoEducativo presEdu = new PrestamoEducativo(
                            nivelEstu, institucion,
                            valorCarrera, numMeses, beneficiario2, 
                            tiempoMes, cuidadPres);
                    presEdu.establecerCuidadPrestamo(cuidadPres);
                    presEdu.establecerPagoBase();
                    presEdu.establecerDescuento();
                    presEdu.establecerValorMensualPrestamo();
                    listaEducativo.add(presEdu);
                }
                default -> System.out.println("Opcion Invalida, ingrese 1 o 2");
            }
            System.out.println("\nDesea repetir el proceso?");
            respuesta = sc.nextLine();
            
                    
                    
                
        }   while (respuesta.equalsIgnoreCase("Si"));
            System.out.println("LISTA DE PRETSAMOS DE AUTOMOVILES");
            for (int i = 0; i < listaAutomovil.size(); i++) {
                System.out.println(listaAutomovil.get(i));
            }
            System.out.println("LISTA DE PRETSAMOS DE ESTUDIANTES");
            for (int i = 0; i < listaEducativo.size(); i++) {
                System.out.println(listaEducativo.get(i));    
            }

        }
}