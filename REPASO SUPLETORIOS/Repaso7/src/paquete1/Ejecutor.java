/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Producto;
import paquete2.ProductoAlimenticio;
import paquete2.ProductoElectronico;
import paquete2.ProductoRopa;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Producto> productos = new ArrayList<>();
       
        ProductoAlimenticio proA = new ProductoAlimenticio("Carne", 20, 5);
        productos.add(proA);
        
        ProductoElectronico proE = new ProductoElectronico("Licuadora", 45, 4);
        productos.add(proE);
        
        ProductoRopa proR  = new ProductoRopa("Camisa", 30, 10);
        productos.add(proR);
        
        
        for (int i = 0; i < productos.size(); i++) {
            productos.get(i).establecerPrecioFinal();
            System.out.println(productos.get(i));
            System.out.println();
            
        }
    }
    
}
