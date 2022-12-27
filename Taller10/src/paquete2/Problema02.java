/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;
        int dia = 0;
        String reporte = "";
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("------------------------------------");
            System.out.printf("Ventas de: %s\n", vendedores[i]);
            dia = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                dia = dia + 1;
                System.out.println("Ingrese el valor de su venta " + dia);
                ventas[i][j] = entrada.nextDouble();
                suma = suma + ventas[i][j];
            }

        }
        // Presentación de resultados
        for (int i = 0; i < vendedores.length; i++) {
            reporte = String.format("%sVendedor(a) %s\n",
                    reporte,
                    vendedores[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%sHa realizado un total de %.2f en ventas.\n",
                reporte,
                suma);
    }
}
