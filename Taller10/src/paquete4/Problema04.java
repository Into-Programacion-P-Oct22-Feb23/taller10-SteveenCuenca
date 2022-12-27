/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int num = 0;
        for (int f = 0; f < datos.length; f++) {
            System.out.println("---------------------------------");
            num = 0;
            for (int c = 0; c < datos[f].length; c++) {
                num = num + 1;
                System.out.println("Ingrese el dar para el arreglo " + num);
                datos[f][c] = entrada.nextDouble();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("El arreglo resultante es:");
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("%.2f\t", datos[f][c]);
            }
            System.out.println("");
        }
    }
}
