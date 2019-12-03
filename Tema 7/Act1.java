import java.util.Scanner;

/**
 * Act1
 */
public class Act1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    }

    public String getString(String){

      for (int i = 0; i < teclado.length()- 2; i++) 
      if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
        caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
        return caracteres;
    }
}