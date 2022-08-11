/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer16;

import java.util.Scanner;

public class Ejer16 {
    
    public static void rellenarVector(int vector[]) {

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = (int)(Math.random()*10);
        }
        System.out.println("Se lleno el vector");
    }
    
    public static void imprimirVector(int vector[]) {

        for (int i=0; i<vector.length ; i++)
        {
            System.out.print( vector[i] + " ,");
        }
        System.out.println("\nSe Imprimio el vector");
    }
    
    public static int buscarNumero(int vector[],int numero) {
        int contador = 0;
        for (int i=0; i<vector.length ; i++)
        {
            if (vector[i]== numero)
            {
                contador+=1;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in );
        
        System.out.println("Ingresa dimension del vector");
        int n = input.nextInt();
        
        System.out.println("Ingrese numero a buscar");
        int numero = input.nextInt();
        
        int[] vector = new int[n];
        
        rellenarVector(vector);
        imprimirVector(vector);
        int cantidadEncontrada = buscarNumero(vector,numero);
        System.out.println("La cantidad de veces que se encontro a " + numero + " es: " + cantidadEncontrada);
    }
    
}
