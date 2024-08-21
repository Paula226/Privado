/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;
import java.util.ArrayList;
import paquete2.Arriendo;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {
    public static void main(String[] args) {
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        // cuando se crea un arrayList y se guardan las clases de arriendo 
        
   ArriendoLocalComida arriendoComida = new ArriendoLocalComida("Christian",
           300);
           arriendoComida.establecerIva(0.10);
           arriendoComida.establecerValorAgua(20.2);
           arriendoComida.establecerValorLuz(40.2);
           
    ArriendoLocalComida arriendoComida2 = new ArriendoLocalComida("Christian",
            300, 40.2, 20.2, 0.10);
    
    ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial("Andrew",
            400);
    arriendoComercial.establecerValorAdicionalFijo(100);
    
    ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones("Angela ",
            350.0);
    arriendoSesiones.establecerValorSillas(10.0);
    arriendoSesiones.establecerValorAmplificacion(20.0);
    
    listaArriendos.add(arriendoComida);
    listaArriendos.add(arriendoComida2);
    listaArriendos.add(arriendoComercial);
    listaArriendos.add(arriendoSesiones);
    
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
            System.out.println(listaArriendos.get(i));
            System.out.println();
            
        }
    
    }
}