import java.util.Scanner;
public class Act04 {
    public static int vocales = 0;
    public static int consonantes = 0;
    public static int otros = 0;

    public Act04(){
        String frase = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        frase = lector.nextLine();

        String palabras [] = frase.split(" ");

        for(int i = 0; i<palabras.length;i++){
            vocales= 0;
            consonantes= 0;
            cuentaVocalesConsonantes(palabras[i]);
            System.out.println("La palabra número "+(i+1)+" tiene:");
            System.out.println("Vocales: "+vocales);
            System.out.println("Consonantes: "+consonantes+"\n");

        }
        System.out.println("Hay un total de "+otros+" caracteres distintos.");

    }
    static void cuentaVocalesConsonantes(String frase){
        char letra;

        frase = frase.trim();
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length();i++){
            letra = frase.charAt(i);

            if (letra == 'a'||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                vocales+=1;
            } else if (Character.isLetter(letra)){
                consonantes+=1;
            } else if (letra != ' '){
                otros+=1;
            }
        }

    }
}