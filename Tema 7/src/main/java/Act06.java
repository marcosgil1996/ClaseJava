import java.sql.SQLOutput;
import java.util.Scanner;
public class Act06 {
    public Act06(){
        String frase = "";
        int vecesPorPantalla = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        frase = lector.nextLine();

        System.out.println("Introduce el número de veces que se imprimirá por pantalla");
        vecesPorPantalla = lector.nextInt();
        lector.nextLine();

        impresoraPorPantalla(frase,vecesPorPantalla);

    }
    static void impresoraPorPantalla(String frase, int veces){
        for (int i = 0;i<veces;i++){
            System.out.println(frase);
        }
    }
}