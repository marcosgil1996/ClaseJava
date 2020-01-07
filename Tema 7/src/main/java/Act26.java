/**
 *
 * @author
 * @version
 */

import java.util.Random;
import java.util.Scanner;


public class Act26 {

    static Scanner scan = new Scanner(System.in);


    public Act26(){

        int[][] matrix = new int[4][8];
        menu(matrix);
    }

    /**
     * Principal con llamada a otros métodos
     * @param
     */

    public static void menu(int[][] matrix){

        boolean validate = false; // Panel de control
        int userInput = 0;

        do {
            System.out.println("MENU");
            System.out.println("----------------------------------------");
            System.out.println("1. TODA LA MATRIZ");
            System.out.println("2.MATRIZ TRASPUESTA");
            System.out.println("3.DISPLAY MATRIZ TRANSPUESTA"); //Fix
            System.out.println("4.DISPLAY ROWS WITH TOTAL");
            System.out.println("5.DISPLAY MAX AND MIN VALUE");
            System.out.println("6.DISPLAY MATRIX MEAN"); // Fix
            System.out.println("7.DISPLAY [N][N] ELEMENT");
            System.out.println("8.DISPLAY [ROW] ELEMENT");
            System.out.println("9 DISPLAY [COL] ELEMENT.");
            System.out.println("10.Guarda en la columna 8 el total de todas las anteriores."); //
            System.out.println("0. SALIDA");
            System.out.println("-----------------------------------------");
            System.out.println("SELECCIONA LA OPCIÓN: ");

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
                    fillMatrix(matrix);
                    break;
                case 2:
                    displayMatrix(matrix);
                    break;
                case 3:
                    displayTransposed(matrix);
                    break;
                case 4:
                    displayRowsTotal(matrix);
                    break;
                case 5:
                    displayMaxMin(matrix);
                    break;
                case 6:
                    displayMean(matrix);
                    break;
                case 7:
                    displayPosition(matrix);
                    break;
                case 8:
                    displayRow(matrix);
                    break;
                case 9:
                    displayCol(matrix);
                    break;
                case 10:
                    break;
                default:
                    System.out.println("INVALID COMMAND, TRY AGAIN");
            }

        }while(!validate);
    }


    /**
     * Fills the matrix with random integers between 0 and 9
     * @param matrix
     */

    public static void fillMatrix(int[][] matrix){

        Random rnd = new Random();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = rnd.nextInt(10);
            }
        }
        System.out.println("MATRIX FILLED WITH RANDOM INTEGERS");
    }


    /**
     * Prints the matrix formatted to screen.
     * @param matrix
     */

    public static void displayMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }

    }


    /**
     *
     * @param matrix
     */

    public static void displayTransposed(int[][] matrix){

        int[][] matrixTransposed = new int[8][4];


        for(int i = 0; i < matrixTransposed.length; i++){
            for(int j = 0; j < matrixTransposed[i].length; j++){
                matrixTransposed[j][i] = matrix[i][j];
                System.out.print(matrixTransposed[i][j]+"\t");

            }
            System.out.println("");
        }
    }


    /**
     * Displays the matrix with the total of every row.
     * @param matrix
     */

    public static void displayRowsTotal(int matrix[][]){

        int total = 0;

        for(int i = 0; i < matrix.length; i++){
            total = 0;
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
                total += matrix[i][j];
            }
            System.out.print("TOTAL: " + total);
            System.out.println("");
        }

    }

    /**
     * Displays the maximum and minimum value of the matrix
     * @param matrix
     */

    public static void displayMaxMin(int[][] matrix){

        int min = 0;
        int max = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] >= max) {
                    max = matrix[i][j];
                }
                if(matrix[i][j] <= min){
                    min = matrix[i][j];
                }
            }
        }

        System.out.print("MAX VALUE: " + max + "\n");
        System.out.print("MIN VALUE: " + min + "\n");

    }


    /**
     *
     * @param matrix
     */

    public static void displayMean(int matrix[][]){

    }


    /**
     * Displays the value of a position (row and col) of the matrix
     * @param matrix
     */
    public static void displayPosition(int[][] matrix){

        int row = 0;
        int col = 0;
        boolean validateRow = false;
        boolean validateCol = false;


        /* Validates row input*/
        do{
            System.out.println("ENTER THE ROW (MAX 3)");
            row = scan.nextInt();
            scan.nextLine();
            if(row >= 4 || row < 0){
                System.out.println("INVALID OPTION, TRY AGAIN");
            }else{
                validateRow = true;
            }

        }while(!validateRow);


        /* Validates col input*/
        do{
            System.out.println("ENTER THE COL (MAX 7)");
            col = scan.nextInt();
            scan.nextLine();
            if(col >= 8 || col < 0){
                System.out.println("INVALID OPTION, TRY AGAIN");
            }else{
                validateCol = true;
            }

        }while(!validateCol);

        System.out.println("POSITION VALUE: " + matrix[row][col] + "\n");


    }


    /**
     * Displays a specified row of the matrix
     * @param matrix
     */

    public static void displayRow(int matrix[][]){

        int row = 0;
        boolean validateRow = false;

        /* Validates row input*/
        do{
            System.out.println("ENTER THE ROW (MAX 3)");
            row = scan.nextInt();
            scan.nextLine();
            if(row >= 4 || row < 0){
                System.out.println("INVALID OPTION, TRY AGAIN");
            }else{
                validateRow = true;
            }

        }while(!validateRow);

        System.out.print("ROW " + row + ": ");

        for(int i = 0; i < matrix[row].length; i++) {
            System.out.print(matrix[row][i] + "\t");
        }
        System.out.println("");

    }


    /**
     * Displays a specified column of the matrix
     * @param matrix
     */

    public static void displayCol(int matrix[][]){

        int col = 0;
        boolean validateCol = false;

        /* Validates col input*/
        do{
            System.out.println("ENTER THE COL (MAX 7)");
            col = scan.nextInt();
            scan.nextLine();
            if(col >= 8 || col < 0){
                System.out.println("INVALID OPTION, TRY AGAIN");
            }else{
                validateCol = true;
            }

        }while(!validateCol);

        System.out.print("COL " + col + ": ");

        for (int[] ints : matrix) {
            System.out.print(ints[col] + "\t");
        }
        System.out.println("");
    }
}
