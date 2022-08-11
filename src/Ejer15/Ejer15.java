/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer15;

/**
 *
 * @author luisa
 */
public class Ejer15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        rellenarVector(vector);
        imprimirVector(vector);
    }

    public static void rellenarVector(int vector[]) {

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = i + 1;
        }
        System.out.println("Se lleno el vector");
    }
    
    public static void imprimirVector(int vector[]) {

        for (int i = vector.length-1; i>=0 ; i--)
        {
            System.out.print( vector[i] + " ,");
        }
        System.out.println("\nSe Imprimio el vector");
    }

}
