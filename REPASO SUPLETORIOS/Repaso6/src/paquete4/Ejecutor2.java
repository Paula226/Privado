/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;
import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Arriendo> listaArriendo = new ArrayList<>();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Selecione el tipo de arriendo que desea ingresar:");
            System.out.println("<1> Arriendo de Comida");
            System.out.println("<2> Arriendo Comercial");
            System.out.println("<3> Arriendo de Sesiones");
            System.out.println("<0> Terminar y mostar resultados");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                sc.nextLine(); // lipiamos el buffer para poder igresar datos de cadena 
                    System.out.println("Ingrese el nombre del arrendatario: ");
                    String nomArrendatario = sc.nextLine();
                    
                    System.out.println("Ingrese el valor base del arriendo: ");
                    double valorArriendo = sc.nextDouble();
                    
                    System.out.println("Ingrese el iva en pocentaje: ");
                    double ivaPor = sc.nextDouble();
                    
                    System.out.println("Ingrese el valor del agua: ");
                    double valAgua = sc.nextDouble();
                    
                    System.out.println("Ingrese el valor de la luz: ");
                    double valLuz = sc.nextDouble();
                    
                    ArriendoLocalComida arriendoComida = new ArriendoLocalComida(nomArrendatario
                            , valorArriendo);
                    arriendoComida.establecerIva(ivaPor);
                    arriendoComida.establecerValorAgua(valAgua);
                    arriendoComida.establecerValorLuz(valLuz);
                    listaArriendo.add(arriendoComida);
                    break;
                
                case 2: 
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del arrendatario: ");
                    String nomArrendatario2 = sc.nextLine();
                    
                    System.out.println("Ingrese el valor del arriendo: ");
                    double valArriendo2 = sc.nextDouble();
                    
                    System.out.println("Ingrese el valor adicional fijo: ");
                    double valAdiFijo = sc.nextDouble();
                    
                    ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial
        (nomArrendatario2, valArriendo2);
                    
                    arriendoComercial.establecerValorAdicionalFijo(valAdiFijo);
                    listaArriendo.add(arriendoComercial);
                    
                    break;
                 
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del arrendatario: ");
                    String nomArrendatario3 = sc.nextLine();
                    
                    System.out.println("Ingrese el valor base del arriendo: ");
                    double valArriendo3 = sc.nextDouble();
                    
                    System.out.println("Ingrese el valor de las sillas: ");
                    double valSillas = sc.nextDouble();
                    
                    System.out.println("Ingrese el valor de Amplificacion: ");
                    double valAmplifi = sc.nextDouble();
                    
                    ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(nomArrendatario3,
                            valArriendo3);
                    arriendoSesiones.establecerValorSillas(valSillas);
                    arriendoSesiones.establecerValorAmplificacion(valAmplifi);
                    listaArriendo.add(arriendoSesiones);
                    break; 
                    
                case 0:
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opcion no validad, por favor intente de nuevo");
                    break;
                    
            }
            for (int i = 0; i < listaArriendo.size(); i++) {
                listaArriendo.get(i).establecerArriendoMensual();
               
                
            }
            CentroComercial centro = new CentroComercial("La pradera",
                    listaArriendo);
            centro.establecerTotalArriendosBaseMensual();
            centro.establecerTotalArriendosFinalMensual();
            System.out.println(centro);
        }
    }
}
