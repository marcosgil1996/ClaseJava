/*
 * Generates an array of N 100 with numbers between 0 and 100, both included. Then, calculates number of 0, multiples
 * of five and multiples of ten.
 * @version 1
 */


import java.util.Random;
import java.util.Arrays;

public class Act19 {

    public Act19(){

        int[] numbers = new int[100];

        Random rnd = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rnd.nextInt(101);
        }

        System.out.println(Arrays.toString(numbers));
        printZero(numbers);
        printMultipleFive(numbers);
        printMultipleTen(numbers);
    }


    /**
     *
     * @param numbers
     */

    public static void printMultipleFive(int[] numbers){

        int fiveCounter = 0;

        System.out.print("-");
        for(int number : numbers){
            if(number % 5 == 0){
                System.out.print(number);
                System.out.print("-");
                fiveCounter++;
            }
        }
        System.out.println(""); // Newline
        System.out.println("Total of five multiples: " + fiveCounter);
    }


    /**
     *
     * @param numbers
     */

    public static void printMultipleTen(int[] numbers){

        int tenCounter = 0;

        System.out.print("-");
        for(int number : numbers){
            if(number % 10 == 0){
                System.out.print(number);
                System.out.print("-");
                tenCounter++;
            }
        }
        System.out.println(""); // Newline
        System.out.println("Total of ten multiples: " + tenCounter);
    }


    /**
     *
     * @param numbers
     */

    public static void printZero(int[] numbers){

        int zeroCounter = 0;

        System.out.print("-");
        for(int number : numbers){
            if(number == 0){
                System.out.print(number);
                System.out.print("-");
                zeroCounter++;
            }
        }
        System.out.println(""); // Newline
        System.out.println("Total of Zeros: " + zeroCounter);
    }
}
