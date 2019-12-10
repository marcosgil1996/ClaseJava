import java.util.Scanner;
public class Act07 {
    public Act07(){
        String frase ="";
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una frase");
        frase = lector.nextLine();

        palabrasPorPantalla(frase);
    }
    static void palabrasPorPantalla(String frase){

        String palabrasDivididas [] = frase.split(" ");

        for (String palabrasDividida : palabrasDivididas) {
            System.out.println(palabrasDividida);
        }
    }
}
