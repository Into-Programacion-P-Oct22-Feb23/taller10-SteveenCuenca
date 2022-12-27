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
        char[][] inicial1 = new char[4][2];
        String[][] inicial2 = new String[4][2];
        String respuesta = "Listado de estudiantes que empiezan por S P T: \n";
        //guardar en respuesta los que empiezan por S P o T
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                inicial1[i][j] = estudiantes[i][j].charAt(0);
                inicial2[i][j] = String.valueOf(inicial1[i][j]);
            }
        }
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (inicial2[i][j].equals("S")
                        || inicial2[i][j].equals("P")
                        || inicial2[i][j].equals("T")) {
                    respuesta = String.format("%s%s\n",
                            respuesta,
                            estudiantes[i][j]);
                }
            }
        }
        System.out.println(respuesta);
    }

}
