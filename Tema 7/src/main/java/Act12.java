import java.util.Scanner;

public class Act12 {
    public Act12(){
        Scanner teclado = new Scanner(System.in);
        String frase ="";
        System.out.println("Introduce la frase");
        frase = teclado.nextLine();
        frase = frase.trim();
        frase = frase.toLowerCase();
        frase = Digits(frase);
        frase  = Words(frase);
        teclado.close();

    }

    /**
     *
     * @param sentece
     * @return
     */
    public static String Digits(String sentece){
        sentece = sentece.replace("\\d", "*");
        return sentece;
    }
    public static  String Words(String sentence){
        sentence = sentence.replaceAll("es","nopor");
        return  sentence;
    }
}
