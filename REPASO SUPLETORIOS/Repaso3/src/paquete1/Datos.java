/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;


/**
 *
 * @author Paula Lopez
 */
public class Datos {

    public static void main(String[] args) {
    
        Estudiante estudiante1 = new Estudiante("René Elizalde", 
                9.2, 10.0, 7.5);
      
        Estudiante estudiante2 = new Estudiante("José Mora", 
                8.1, 9.1, 5.5);
       
        Estudiante estudiante3 = new Estudiante("Luis Suarez", 
                7.1, 6.1, 9.2);
      
        Estudiante estudiante4 = new Estudiante("Sara Diaz", 
                8.1, 9.1, 8.2);
       
        Estudiante estudiante5 = new Estudiante("Marco Salinas", 
                4.4, 8.9, 9.2);
    
        Estudiante estudiante6 = new Estudiante("Juan Silva", 
                10.0, 9.1, 7.2);
    
        Estudiante estudiante7 = new Estudiante("Rosa Jara", 
                8.1, 8.9, 5.9);
        
        
        ArrayList<Estudiante> listadoEstudiantes = new ArrayList<>();
        listadoEstudiantes.add(estudiante1);
        listadoEstudiantes.add(estudiante2);
        listadoEstudiantes.add(estudiante3);
        listadoEstudiantes.add(estudiante4);
        listadoEstudiantes.add(estudiante5);
        listadoEstudiantes.add(estudiante6);
        listadoEstudiantes.add(estudiante7);
        // add es para agregar un objeto a la lista

        
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            listadoEstudiantes.get(i).establecerPromedio(i);
            
            
        }
        String nombre = "Notas";
        ListaEstudiantes list = new ListaEstudiantes(nombre, 
                listadoEstudiantes);
        list.establecerPromedioTotal();
        list.establecerPromedioAlto();
        list.establecerPromedioBajo();
        
        System.out.println(list);
    }
}
