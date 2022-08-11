/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer14;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejer14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese cantidad de euros");
        float cantidad = input.nextFloat();

        System.out.println("Ingrese moneda");
        String moneda = input.nextLine();
        moneda = input.nextLine();
        convertirMoneda(cantidad, moneda);

    }

    public static void convertirMoneda(float dinero, String moneda) {

        switch (moneda)
        {

            case "libras":
                System.out.println(dinero + " euros en libras es: " + (dinero * 0.86));
                break;
            case "dolares":
                System.out.println(dinero + " euros en dolares es: " + (dinero * 1.28611));
                break;
            case "yenes":
                System.out.println(dinero + " euros en yenes es: " + (dinero * 129.852));
                break;
            default:
                System.out.println("Ingrese una moneda valida hdp");
        }

    }

}
