import java.util.Scanner;

public class Act10 {

    public Act10(){
        Scanner teclado = new Scanner(System.in);
        String palabra = "";
        System.out.println("Ingrese una palabra paligroma, y te compruebo si es o no es"); // Mensaje a pantalla
        palabra = teclado.nextLine(); //Guardado de datos del la frase palidromo
        System.out.println("La palabra es  ");

    }

    /**
     *
     * @param frase es evaluda si es o no es palidromo
     * @return verdadero si la palabra es palidromo
     */
    public  static  boolean detectarPalidromos(String frase){
        frase = frase.replace("\\s+","");
        frase = frase.toLowerCase();

        int i = 0;
        int j= frase.length()-1;
        while (i<j){
            if(frase.charAt(i) != frase.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
