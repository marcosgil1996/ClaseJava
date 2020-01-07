/*
 * Creates two arrays of 50 ints, V and P, fills P with even numbers of V.
 * @author
 */


import java.util.Arrays;
import java.util.Random;


public class Act25 {

    public Act25(){

        int[] V = new int[50];
        int[] P = new int[50];

        fillArray(V);
        truncateEven(V,P);

        System.out.println(Arrays.toString(V));
        System.out.println(Arrays.toString(P));

    }


    /**
     * Fills the array with random integers
     * @param V Array of 50 int
     */

    public static void fillArray(int[] V){

        Random rnd = new Random();

        for(int i = 0; i < V.length; i++){
            V[i] = rnd.nextInt(11);
        }
    }


    /**
     *
     * @param V Array of 50 int
     * @param P Array of 50 int
     */

    public static void truncateEven(int[] V, int[] P){

        for(int i = 0; i < V.length; i++){

            if(V[i] % 2 == 0){
                P[i] = V[i];
            }else{
                //P[i] = -1;
            }
        }
    }
}
