/**
 *
 * @author
 * @version
 */


import java.util.Random;


public class Ejercicio28 {

    public Ejercicio28(){

        char[] randomChars = new char[500];

        fillArray(randomChars);
        printChars(randomChars);
    }


    /**
     * Fills the array with random chars based on random numbers of the Random class
     * @param randomChars Array of 500 positions
     */

    public static void fillArray(char[] randomChars){

        char rndChar; // Stores a random char between A and Z both included

        Random rnd = new Random();

        for(int i = 0; i < randomChars.length; i++){
            rndChar = (char)(rnd.nextInt(26) + 'a');
            rndChar = Character.toUpperCase(rndChar);
            randomChars[i] = rndChar;
        }
    }


    /**
     * Prints every occurrence of the letters in the given char array
     * @param randomChars
     */

    public static void printChars(char[] randomChars){

        char[] alphabet = {'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'
                , 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int[] numChars = new int[26]; // Stores the counter of every char

        for(int i = 0; i < randomChars.length; i++){
            switch(randomChars[i]){
                case 'A':
                    numChars[0]++;
                    break;
                case 'B':
                    numChars[1]++;
                    break;
                case 'C':
                    numChars[2]++;
                    break;
                case 'D':
                    numChars[3]++;
                    break;
                case 'E':
                    numChars[4]++;
                    break;
                case 'F':
                    numChars[5]++;
                    break;
                case 'G':
                    numChars[6]++;
                    break;
                case 'H':
                    numChars[7]++;
                    break;
                case 'I':
                    numChars[8]++;
                    break;
                case 'J':
                    numChars[9]++;
                    break;
                case 'K':
                    numChars[10]++;
                    break;
                case 'L':
                    numChars[11]++;
                    break;
                case 'M':
                    numChars[12]++;
                    break;
                case 'N':
                    numChars[13]++;
                    break;
                case 'O':
                    numChars[14]++;
                    break;
                case 'P':
                    numChars[15]++;
                    break;
                case 'Q':
                    numChars[16]++;
                    break;
                case 'R':
                    numChars[17]++;
                    break;
                case 'S':
                    numChars[18]++;
                    break;
                case 'T':
                    numChars[19]++;
                    break;
                case 'U':
                    numChars[20]++;
                    break;
                case 'V':
                    numChars[21]++;
                    break;
                case 'W':
                    numChars[22]++;
                    break;
                case 'X':
                    numChars[23]++;
                    break;
                case 'Y':
                    numChars[24]++;
                    break;
                case 'Z':
                    numChars[25]++;
                    break;
            }
        }

        for(int j = 0; j < alphabet.length; j++){
            System.out.println("Number of " + alphabet[j] + ": " + numChars[j]);
        }

    }
}
