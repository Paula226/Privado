/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Electrodomestico;
import paquete2.Lavadora;
import paquete2.Refrigerador;
import paquete2.Televisor;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electros = new ArrayList<>();
        
        Lavadora lav1 = new Lavadora("LG", 0.5, 5, 1.0);
        electros.add(lav1);
        
        Refrigerador ref1 = new Refrigerador("Samsung", 0.8, 24,
                true);
        electros.add(ref1);
        
        Televisor tel1 = new Televisor("Sony", 0.2, 6, "4K");
        electros.add(tel1);
        
        for (int i = 0; i < electros.size(); i++) {
            electros.get(i).establecerConsumo();
            System.out.println(electros.get(i));
            System.out.println();
            
        }
        
    }
    
}
