//Un programa que solicida dos numero y los ordena de mayor a menor

import java.util.Scanner;

public class Act4Numero {
    public static void main(String[] args) {
         double n1, n2; //Variables utilizadas para los datos que introduzca el usuario
         Scanner n = new Scanner(System.in);

            //Se piden los dos datos
            System.out.println("Introduce el primer número");
            n1 = n.nextDouble(); //Ponemos nextDouble, ya que, las variables declaradas estan en double y son numero reales.
            n.nextLine();
            System.out.println("Introduce el segundo número");
            n2 = n.nextDouble();
            n.nextLine();

            //Se compara
            if(n1>n2){
                System.out.println(n2 + " es mayor " + n1); 
             } else{
                System.out.println( n1 + " es mayor que " + n2);
             }
             n.close(); //Cierre del teclado n
    }
}