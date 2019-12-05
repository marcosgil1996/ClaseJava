import java.util.Scanner;

public class Act03 {

    public Act03(){
        Scanner teclado = new Scanner(System.in);
        //Declaramos las variables
        String texto = "";
        System.out.println("Ingrese el texto");
        texto =  teclado.nextLine();
        //Salida a pantalla
        System.out.println(getEpacios(texto));
        teclado.close();
    }

    public static int getEpacios(String frase) {
        boolean esPalabra = false;
        int palabras = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if(Character.isSpaceChar(c) || c=='\n' || c== '\t'){
                esPalabra = false;
                palabras++;
            }else if (!esPalabra && Character.isLetter(c)){
                esPalabra = true;
                palabras++;
            }
        }
        return palabras;
    }



}
