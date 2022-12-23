/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
          String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
    {"Carrie Burton", "Lauren Rice"},
    {"Emma Escobar", "Lori Flores"},
    {"Steven West", "Toni Martin"}};
    String inicial = "S";
    char inicialLetra;
    boolean bandera = true;
    while (bandera) {
            for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                inicialLetra = estudiantes[f][c].charAt(0);
                String inicialDos = String.valueOf(inicialLetra);
                if (inicial.equals(inicialDos)) {
                    bandera = false;
                }
            }
        }
    }
    }
}
