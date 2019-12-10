/*
 *
 */

import java.util.Scanner;

public class Act08 {

    public Act08() {

        String sentence = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("INTRODUCE A SENTENCE: ");
        sentence = scan.nextLine();
        sentence = sentence.trim();
        parseWords(sentence);

    }

    /**
     * Truncates every word of a sentence an prints it in a newline
     *
     * @param sentence
     */
    public static void parseWords(String sentence) {

        String word = ""; /*Stores the truncated words */
        sentence += "."; /*Adds a full stop at the end for truncating the last word*/

        for (int i = 0; i < sentence.length(); i++) {
            char x = sentence.charAt(i); /*Sames as i, used for visual and ease purposes*/
            if (Character.isLetter(x)) {
                word += x;
            } else if (Character.isSpaceChar(x)) {
                printWords(word);
                word = "";
            } else {
                printWords(word);
            }
        }
    }

    public static void printWords(String word) {

        int len = word.length();
        System.out.printf("%-5s" + " || " + "%1d\n", word, len);

    }
}

