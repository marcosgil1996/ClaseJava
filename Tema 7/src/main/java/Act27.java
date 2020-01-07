/*
 *  Crea un vector V numérico de 50 elementos y otro P de 20 elementos. A continuación genera
 * M(50,20) de tal forma que M(i,j) es igual a V(i)*P(j).
 * @author
 * @version
 */


import java.util.Arrays;
import java.util.Random;


public class Act27 {

    public Act27(){

        int[] v = new int[50];
        int[] p = new int[20];
        int[][] m = new int[50][20];

        fillArray(v);
        fillArray(p);
        fillMatrix(v, p, m);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(p));
        displayMatrix(m);
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

        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + "\t");
            System.out.println("");
        }

    }
}
