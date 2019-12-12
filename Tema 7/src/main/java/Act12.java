import java.util.Scanner;

public class Act12 {
    public Act12(){
        Scanner teclado = new Scanner(System.in); // invocamos la clase escaner para poder leer los datos a los usuario
        String frase = ""; //un String vacio para guardar los datos que introduzcan los usuarios
        System.out.println("Introduce la frase"); //Se le piden los datos a los usuarios
        frase = teclado.nextLine(); //Se guardan los datos de la frase introducida por los usuarios
        frase = frase.trim(); //Eliminamos los espacios del principio y del final de la frase escrita por el usuario
        frase = frase.toLowerCase(); //Pasamos palabras en mayúsculas en minusculas de la cadena
        frase = Digits(frase); //llamada al método de Digits de sustitución
        frase  = Words(frase); //llamada al métood de Words de sustitición
        System.out.println(frase);
        teclado.close(); //cierre del tecldo

    }

    /**
     *
     * @param sentece para la palabra
     * @return un remplazo de palabras
     */
    public static String Digits(String sentece){
        sentece = sentece.replace("\\d", "*");
        return sentece;
    }

    /**
     *
     * @param sentence para la palabra
     * @return remplazo de palabra de "es" por "no por"
     */
    public static  String Words(String sentence){
        sentence = sentence.replaceAll("es","no por");
        return  sentence;
    }
}
