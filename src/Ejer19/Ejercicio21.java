
public class Ejercicio21 {

	public static void main(String[] args){
		int i , j;
		int tamFilasMatrizP = 10;
		int tamColumnasMatrizP = 10;
		int tamFilasSubMatriz = 3;
		int tamColumnasSubMatriz = 3;
		//int[][] matrizP = new int[tamFilasMatrizP][tamColumnasMatrizP];
		
		int subMatriz[][] = {{40,15,6},
        		             {30,5,61},
        		             {14,5,11}};
        
        int matrizP[][]={{1,2,3,4,5,6,7,8,9,10},
        		 {1,2,3,40,5,6,7,8,9,10}, 
                         {1,2,3,4,5,6,7,8,9,10},
                         {1,2,3,4,5,6,7,8,9,10},
                         {1,2,3,40,15,6,7,8,9,10}, 
                         {1,2,3,30,5,61,7,8,9,10},
                         {1,2,3,14,5,11,7,8,9,10},
                         {1,2,3,4,5,6,7,8,9,10},
            	         {1,2,3,4,5,6,7,8,9,10}, 
                         {1,2,3,4,5,6,7,8,9,10}};
  
        for(i = 0 ; i <= (tamFilasMatrizP-tamFilasSubMatriz); i++) {
        	for(j = 0; j<=(tamColumnasMatrizP-tamColumnasSubMatriz) ; j++) {
        		if(matrizP[i][j] == subMatriz[0][0]){
        			if(compararMatrices(matrizP,subMatriz,i,j,tamFilasSubMatriz,tamColumnasSubMatriz)) {
        				imprimePosiciones(i,j);
        				
        		    }
        			
        			
        		}
        		 
        	}

        }
       
        
	}

    public static boolean compararMatrices(int matrizP[][],int subMatriz[][], int indiceFila , int indiceColumna ,int tamFilasSubMatriz, int tamColumnasSubMatriz){
        int posAuxFila = indiceFila;
        int posAuxColumna = indiceColumna;
    	boolean sonIguales = true ;
        for(int x =posAuxFila ; x < posAuxFila + tamFilasSubMatriz-1  && sonIguales; x++){
        	for(int y = posAuxColumna ; y < posAuxColumna + tamColumnasSubMatriz -1 && sonIguales ; y++){
        	    if(matrizP[x][y] != subMatriz[x-posAuxFila][y-posAuxColumna]){
        	        sonIguales = false;
        	    } 	
            } 	   
        }	
        return sonIguales;
    }

	public static void imprimePosiciones(int i, int j) {
		int posInicialFila = i;
		int posInicialColumna = j;
		for(int k = posInicialFila ; k < posInicialFila + 3 ; k++) {
			for(int l = posInicialColumna ; l < posInicialColumna + 3 ; l++) {
				System.out.print(k);
				System.out.print(l);
				System.out.print("  ");
			}
		}
		
	}
    }
    
   
    
