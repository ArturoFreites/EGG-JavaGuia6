/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaEj06;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int limite = 25;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese num1");
        int num1 = leer.nextInt();

        System.out.println("Ingrese num2");
        int num2 = leer.nextInt();

        if (num1 > limite || num2 > limite)
        {
            System.out.println("Ambos o uno de ellos es mas grande que 25");
        } else
        {
            System.out.println("ambos son menores o uno de ellos");
        }

    }

}
