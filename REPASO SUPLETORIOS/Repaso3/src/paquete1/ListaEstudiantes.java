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
public class ListaEstudiantes {
    private String nombre;
    private ArrayList<Estudiante> listadoEstudiantes;
    private double promedioTotal;
    private Estudiante promedioAlto;
    private Estudiante promedioBajo;

    public ListaEstudiantes(String nom, ArrayList<Estudiante> listEstudiantes) {
        nombre = nom;
        listadoEstudiantes = listEstudiantes;
       
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerListadoEstudiantes(ArrayList<Estudiante> c) {
        listadoEstudiantes = c;
    }

    public void establecerPromedioTotal() {
        promedioTotal = 0;
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            promedioTotal += listadoEstudiantes.get(i).obtenerPromedio();
           // += ---> acumular i++ --> incrementa o actualiza los datos
        }
    }

    public void establecerPromedioAlto() {
        promedioAlto = listadoEstudiantes.get(0);
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            if (listadoEstudiantes.get(i).obtenerPromedio()> 
                    promedioAlto.obtenerPromedio()) {
                promedioAlto = listadoEstudiantes.get(i);
                // size para saber el tamaños
                // get para saber la posicion de cada una 
                
            }
            
        }
    }

    public void establecerPromedioBajo() {
        promedioBajo = listadoEstudiantes.get(0);
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            if (listadoEstudiantes.get(i).obtenerPromedio()< 
                    promedioBajo.obtenerPromedio()) {
                promedioBajo = listadoEstudiantes.get(i);
            }
        }
    }
    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> obtenerListadoEstudiantes() {
        return listadoEstudiantes;
    }

    public double obtenerPromedioTotal() {
        return promedioTotal;
    }

    public Estudiante obtenerPromedioAlto() {
        return promedioAlto;
    }

    public Estudiante obtenerPromedioBajo() {
        return promedioBajo;
    }
    
    @Override
    public String toString() {
        String cadena = "Notas de la Institucion Mater Gey\n";
        // null ---> variable esta vacia 
        // "" ---> si hay algo pero no se puede ver porque no hay nada pero hay 
        //algo
        
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            Estudiante estu = listadoEstudiantes.get(i);
            cadena += estu + "\n";
        
            
        }
        cadena = String.format("%s\n"
                + "-----------------------------------\n"
                + "Promedio Alto: %s\n"
                + "Promedio Bajo: %s\n"
                + "Promedio Totales: %s\n",
                cadena,
                obtenerPromedioAlto(),
                obtenerPromedioBajo(),
                obtenerPromedioTotal());
        return cadena;
    }
    
}
