import java.util.Scanner;

public class MayorOMenor {
    public static void main(String[] args) {
    int n1, n2; //Variables utilizadas para los datos que introduzca el usuario
    Scanner n = new Scanner(System.in);

    //Se piden los dos datos
    System.out.println("Introduce el primer número");
    n1 = n.nextLine();
    System.out.println("Introduce el segundo número");
    n2 = n.nextLine();

    //Se compara
    if(n1>n2){
        System.out.println(n1 + " es mayor que " + n2); 
    }else{
        System.out.println(n2 + "es mayor que" + n1);
    }
    n.close(); //Cierre del teclado n
    }
}