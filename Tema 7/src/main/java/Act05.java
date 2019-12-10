import java.util.Scanner;
public class Act05{
    public Act05(){
        String frase ="";
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        frase = lector.nextLine();

        palabraMasLarga(frase);

    }
    static void palabraMasLarga(String frase){

        int palabraMasGrande = 1;
        int numCaracteres;
        String palabraGanadora = "";
        String palabraActual = "";

        String palabras [] = frase.split(" ");


        for(int i = 0; i<palabras.length; i++){
            palabraActual = palabras[i];
            numCaracteres = 0;
            for(int j = 0;j<palabraActual.length();j++){

                numCaracteres++;
            }

            if(numCaracteres > palabraMasGrande){
                palabraMasGrande = numCaracteres;
                palabraGanadora = palabraActual;
            }

            System.out.println((i+1)+" .- "+palabras[i]);
            System.out.println("Tiene "+numCaracteres+" caracteres");
        }
        System.out.println("La palabra mas grande es: "+palabraGanadora);
    }
}