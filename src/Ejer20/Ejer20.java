package Ejer20;

import java.util.Scanner;

public class Ejer20 {

    public static void rellenarMatriz(int[][] matriz) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.println("Ingrese numero en posicion " + i + " " + j);
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static boolean comprobarMatriz(int[][] matriz) {
        boolean cumple = true;
        int sumaReferencia = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaPdiagonal = 0;
        int sumaSdiagonal = 0;
        int auxi = 0;
        int auxj = matriz.length-1;

        for (int i = 0; i < matriz.length; i++)
        {
            sumaReferencia += matriz[0][i];
        }

        for (int i = 0; i < matriz.length && cumple == true; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                sumaFilas += matriz[i][j];
                sumaColumnas += matriz[j][i];

                if (i == auxi && j == auxj)
                {
                    sumaSdiagonal += matriz[i][j];  
                    auxi++;
                    auxj--;
                }
                if (i == j)
                {
                    sumaPdiagonal += matriz[i][j];
                }

            }
            cumple = sumaFilas == sumaReferencia && sumaColumnas==sumaReferencia;
            sumaFilas = 0;
            sumaColumnas = 0;

        }
        cumple = sumaPdiagonal == sumaReferencia && sumaSdiagonal == sumaReferencia;

        return cumple;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        boolean respuesta;

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        respuesta = comprobarMatriz(matriz);
        System.out.println("La matriz es magica? " + respuesta);
    }
}
