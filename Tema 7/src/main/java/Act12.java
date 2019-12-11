import java.util.Scanner;

public class Act12 {
    public Act12(){
        Scanner teclado = new Scanner(System.in);
        String frase ="";
        System.out.println("Introduce la frase");
        frase = teclado.nextLine();
        frase = frase.trim();
        frase = frase.toLowerCase();
        frase = frase.replaceD
    }
    public static String replaceDigits(String sentece){
        sentece = sentece.replace("\\d", "*");
        return sentece;
    }
}
