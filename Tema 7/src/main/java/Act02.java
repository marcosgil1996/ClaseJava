import java.util.Scanner;

public class Act02{

    public Act02(){
        Scanner teclado = new Scanner(System.in);
        int contadorVocal = 0;
        int contadorConst = 0;

        String frase = "";
        System.out.println("*** Ingrese la frase ***");
        frase = teclado.nextLine();
        System.out.println("Tienes" + getVocal + "Vocales" + "y" + );

        teclado.close();
    }
    public static boolean getVocal(char c) {
        if ((Character.toLowerCase(c) == 'a') || (Character.toLowerCase(c) == 'e')|| (Character.toLowerCase(c) == 'i')
                || (Character.toLowerCase(c) == 'o') || (Character.toLowerCase(c) == 'u'))
            return true;
        else
            return false;
    }
}

