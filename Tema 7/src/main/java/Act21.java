/*
 * Creates an array of ints of a length of 10 and performs a series of operations.
 * @author RCP
 * @version 1
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Act21 {

    static Scanner scan = new Scanner(System.in);


    public Act21(){

        int[] numbers = new int[10]; // Array declaration and init

        menu(numbers);
    }


    /**
     * Main menu to call other methods
     * @param vector ñe
     */

    public static void menu(int[] vector){

        boolean validate = false; // Controls the flow of the menu loop
        int userInput = 0;

        do {
            System.out.println("MAIN MENU");
            System.out.println("------------");
            System.out.println("1.FILL ARRAY");
            System.out.println("2.DISPLAY ARRAY CONTENT");
            System.out.println("3.DISPLAY EVEN POSITIONS");
            System.out.println("4.DISPLAY MULTIPLE OF 3 POSITIONS");
            System.out.println("0.EXIT");
            System.out.println("--------------------");
            System.out.println("SELECT OPTION: ");

            userInput = scan.nextInt();
            scan.nextLine();

            /*
             * Calls methods based on user's input and filters error
             *
             */
            switch (userInput){
                case 0:
                    validate = true;
                    break;
                case 1:
                    crearArray(vector);
                    break;
                case 2:
                    visualitzarArray(vector);
                    break;
                case 3:
                    visualitzarParell(vector);
                    break;
                case 4:
                    visualitzarMultiple3(vector);
                    break;
                default:
                    System.out.println("INVALID COMMAND, TRY AGAIN");
            }

        }while(!validate);
    }


    /**
     * Fills the array with random integers from 0 to 50
     * @param vector
     */

    public static void crearArray(int[] vector){

        Random rnd = new Random();

        for(int i = 0; i < vector.length; i++){
            vector[i] = rnd.nextInt(51);
        }

        System.out.println("ARRAY FILED WITH RANDOM INTS");
    }


    /**
     * Outputs the array to screen
     * @param vector
     */

    public static void visualitzarArray(int[] vector){

        System.out.println(Arrays.toString(vector));
    }


    /**
     * Outputs the even positions of the array to screen
     * @param vector
     */

    public static void visualitzarParell(int[] vector){

        System.out.print("[");

        for(int i = 0; i < vector.length; i++){

            if(i % 2 == 0){
                System.out.print(vector[i]);
                System.out.print(", ");
            }
        }

        System.out.print("]");
        System.out.println(""); // New line at the end of the print
    }


    /**
     * Outputs the multiple of 3 positions of the array to screen
     * @param vector
     */

    public static void visualitzarMultiple3(int[] vector){

        System.out.print("[");

        for(int i = 0; i < vector.length; i++){

            if(vector[i] % 3 == 0){
                System.out.print(vector[i]);
                System.out.print(", ");
            }
        }

        System.out.print("]");
        System.out.println(""); // New line at the end of the print
    }


}
