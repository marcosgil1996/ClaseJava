import java.util.Scanner;
/**
 * Act1
 */
public class Act1 {

    public Act1(){
        String frase = "Hola caracola";
        frase = primeraMayuscula(frase);
    }

    public String primeraMayuscula(String frase){
        frase = frase.trim();
         return Character.toUpperCase(frase.charAt(0)) + frase.substring(1);

    }
}