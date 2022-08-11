/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaEj08;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num1 = input.nextInt();

        while (num1 < 0 || num1 > 10)
        {
            System.out.println("Error - Ingrese numero");
            num1 = input.nextInt();
        }
        
        System.out.println("Numero valido");

    }

}
