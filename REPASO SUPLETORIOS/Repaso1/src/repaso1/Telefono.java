/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author Paula Lopez
 */
public class Telefono {
    private String numero;
    private String marca;

    public Telefono(String num, String mar) {
        numero = num;
        marca = mar;
    }

    public void establecerNumero(String c) {
        numero = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obetenerMarca() {
        return marca;
    }
    
}
