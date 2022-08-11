package Ejer18;

public class Ejer18 {

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length - 1; i++)
        {
            for (int j = 0; j < matriz.length - 1; j++)
            {
                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void rellenarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length - 1; i++)
        {
            for (int j = 0; j < matriz.length - 1; j++)
            {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    private static void matrizTranspuesta(int[][] matriz) {
        int[][] matrizTranspuesta = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length - 1; i++)
        {
            for (int j = 0; j < matriz.length - 1; j++)
            {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        imprimirMatriz(matrizTranspuesta);
    }

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        matrizTranspuesta(matriz);

    }

}
