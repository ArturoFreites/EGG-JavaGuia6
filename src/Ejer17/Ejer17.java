/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer17;

import java.util.Scanner;

public class Ejer17 {

    public static void rellenarVector(String vector[]) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++)
        {
            System.out.println("Ingrese valor en posicion" + i);
            vector[i] = input.nextLine();
        }
        System.out.println("Se lleno el vector");
    }

    public static void imprimirVector(String vector[]) {

        for (int i = 0; i < vector.length; i++)
        {
            System.out.print(vector[i] + " ,");
        }
        System.out.println("\nSe Imprimio el vector");
    }

    public static void busquedadigitos(String vector[]) {
        int unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;

        for (int i = 0; i < vector.length; i++)
        {
            switch (vector[i].length())
            {
                case 1:
                    unDigito += 1;
                    break;
                case 2:
                    dosDigitos += 1;
                    break;
                case 3:
                    tresDigitos += 1;
                    break;
                case 4:
                    cuatroDigitos += 1;
                    break;
                case 5:
                    cincoDigitos += 1;
                    break;
            }

        }
        
        System.out.println("\nvalores con un digitos= " + unDigito);
        System.out.println("\nvalores con dos digitos= " + dosDigitos);
        System.out.println("\nvalores con tres digitos= " + tresDigitos);
        System.out.println("\nvalores con cuatro digitos= " + cuatroDigitos);
        System.out.println("\nvalores con cinco digitos= " + cincoDigitos);
        
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa dimension del vector");
        int n = input.nextInt();

        String[] vector = new String[n];

        rellenarVector(vector);
        imprimirVector(vector);
        busquedadigitos(vector);

    }

}
