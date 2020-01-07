/*
 * Takes an array of 10 integers and creates another array with the same elements but reversed.
 * @author RCP
 * @version 1
 */


import java.util.Arrays;


public class Act23 {

    public Act23(){

        int[] V = {1,2,3,4,5,6,7,8,9,10};
        int[] P = new int[10]; // Reverse Array

        P = fillArray(V,P);

        /*
        Outputs to screen the results
         */
        System.out.print("PRIMER ARRAY: ");
        System.out.println(Arrays.toString(V));
        System.out.println("");
        System.out.print("REVERSE ARRAY: ");
        System.out.println(Arrays.toString(P));
        System.out.println("");
    }


    /**
     * Reverses an array of 10 numbers and returns it as another array.
     * @param V
     * @param P
     * @return
     */

    public static int[] fillArray(int[] V, int[] P){

        int secondArrayCounter = 0; // Points the positions for the reverse array

        for(int i = V.length - 1; i >= 0; i--){
            P[secondArrayCounter] = V[i];
            secondArrayCounter++;
        }

        return P;
    }
}
