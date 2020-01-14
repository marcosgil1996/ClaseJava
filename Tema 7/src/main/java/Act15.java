/*
 * Generates an array of 10 char elements and prints even and odd positions
 * @author
 * @version 1.1
 */


import java.util.Scanner;


public class Act15 {

    static Scanner scan = new Scanner(System.in); // Global Scanner

    public Act15() {

        generateArray();
    }

    public static void generateArray() {

        int[] numbers = new int[20];

        /* INTRODUCE THE ARRAY NUMBERS*/
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce an array element: ");
            numbers[i] = scan.nextInt();
            scan.nextLine();
        }

        printArray(numbers);
    }


    /**
     * Impresión de los números TAB
     * @param numbers para da usos a los números introduccidos
     */
    public static void printArray(int[] numbers){

        /*Print the array elements in table format*/
        for (int i = 0; i < numbers.length; i++) {

            if(i == 3 || i == 7 || i == 11 || i == 15 || i == 19){
                System.out.print(numbers[i]);
                System.out.println(); // New Line
            } else{
                System.out.print(numbers[i]);
                System.out.print(" -- ");
            }
        }
    }
}
