/**
 *  Crea un vector V numérico de 50 elementos y otro P de 20 elementos. A continuación genera
 * M(50,20) de tal forma que M(i,j) es igual a V(i)*P(j).
 * @author
 * @version
 */


import java.util.Arrays;
import java.util.Random;


public class Ejercicio27 {

    public Ejercicio27(){

        int[] V = new int[50];
        int[] P = new int[20];
        int[][] M = new int[50][20];

        fillArray(V);
        fillArray(P);
        fillMatrix(V, P, M);
        System.out.println(Arrays.toString(V));
        System.out.println(Arrays.toString(P));
        displayMatrix(M);
    }

    public static void fillArray(int[] array){

        Random rnd = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(11);
        }
    }

    public static void fillMatrix(int[] V, int[] P, int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = V[i] * P[j];
            }
        }
    }

    public static void displayMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }

    }
}
