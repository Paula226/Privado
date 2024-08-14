/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import repaso1.*;

public class Ejecutor {

    public static void main(String[] args) {
          ArrayList<Persona> persona = new ArrayList<>();
        Telefono cel1 = new Telefono("099541548", "Samsung A50");
        Persona representante1 = new Adulto(cel1, "Diego", 30,
                "1150048357");
        Ninio chica = new Ninio((Adulto) representante1, "Paulita", 10,
                "110454787");

         persona.add(chica);
         persona.add(representante1);
        ArrayList<Tarifa> boleto = new ArrayList<>();
        Tarifa tarifa1 = new Tarifa(chica,true);
        boleto.add(tarifa1);

        Tarifa tarifa2 = new Tarifa(representante1,true );
        boleto.add(tarifa2);

        // for (int i = 0; i < persona.size(); i++) {
        for (int i = 0; i < boleto.size(); i++) {
            boleto.get(i).establecerTarifa();

        }
        Factura fac = new Factura("Feria de Loja");
        fac.establecerListaPersona(persona);
        fac.establecerListaTarifa(boleto);
        fac.establecerTotalAcumulado();
     
        System.out.printf("%s\n",fac);
    }

}
