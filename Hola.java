import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Hola {

    public static void main(String[] args) {

        int[] numeros = {1,3,4};

        int[] masnumeros = {1,3,98};
        int[] ultimosnumeros = {11,31,4};

        int[][] miMatriz ;
        miMatriz = new int[3][3];
        miMatriz[0] = numeros;
        miMatriz[1] = masnumeros;
        miMatriz[2] = ultimosnumeros;

//numero1++ === numero1 = numero1 + 1;

        int[] miArray = new int[3];
        int[] valores = {11,212,123123};
        miArray = valores;
        //1º INICIALIZACION DE LA VARIABLE UTILIZADA DENTRO DE BUCLE
        //2º concicion
        //3º 
        for(int col = 0; col < 3 ; col++){
            for(int fila = 0; fila < 3 ; fila++){
                System.out.print("| "+ miMatriz[fila][col]+" |");
                //fila = fila + 1;
            }
            //col = col + 1;
        }

//acacacfdad matriz inversa

        


        //vector<int> numeritos;

     



        MostrarMatriz(miMatriz);
        

         



    


    }

    public static int hola(int numero){
        numero = 9;
        return numero;
    }



    public static void MostrarMatriz(int[][] numeritos){

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print("| "+ numeritos[i][j] + " |");
            }
            System.out.println();
        }
            
    
    }
    

}