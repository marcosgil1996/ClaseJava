/**
 * Creates an array of 10 numeric elements and copies the elements that are >10 no a new Array
 * @author
 * @version
 */

import java.util.Arrays;
import java.util.Scanner;


public class Act22 {


    static Scanner scan = new Scanner(System.in);


    public Act22(){

        int[] P = new int[10];
        int[] S = new int[10];

        P = fillArray(P);
        S = copyArray(P,S);

        /*
        Outputs to screen the results
         */
        System.out.print("FIRST ARRAY: ");
        System.out.println(Arrays.toString(P));
        System.out.println("");
        System.out.print("FIRST ARRAY: ");
        System.out.println(Arrays.toString(S));
        System.out.println("");
    }


    /**
     * Fills a numeric array of 10 elements
     * @param numbers
     * @return
     */

    public static int[] fillArray(int[] numbers){

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Introduce a number: ");
            numbers[i] = scan.nextInt();
            scan.nextLine();
        }

        return numbers;
    }


    /**
     * Copies elements >10 of P to S
     * @param P
     * @param S
     * @return
     */

    public static int[] copyArray(int[] P, int[] S ){

        int secondArrayCounter = 0; // Manages the position in the S array

        for(int i = 0; i < P.length; i++){

            /*
            Copies elements of P to S
             */
            if(P[i] > 10){
                S[secondArrayCounter] = P[i];
                secondArrayCounter++;
            }else{
                S[secondArrayCounter] = -1;
                secondArrayCounter++;
            }
        }

        return S;
    }
}
