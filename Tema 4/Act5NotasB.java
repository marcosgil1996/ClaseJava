// Versión con numero enteros

import java.util.Scanner;

public class Act4Numero {

    public enum Clasificacion{
        Insuficiente, Suficiente, Sobresaliente, Bien, Notable, ERROR
    }
    public static void main(String[] args) {
         Clasificacion nota; //Variables utilizadas para los datos que introduzca el usuario
         int numero;
         Scanner teclado = new Scanner(System.in);

            //Se piden los dos datos
            System.out.println("Introduce la nota deseada");
            numero = teclado.nextInt(); //Ponemos nextDouble, ya que, las variables declaradas estan en double y son numero reales.
            teclado.nextLine();
            

            //Se compara
            if(numero => 0 && numero < 5){
                nota = Clasificacion.Insuficiente;
            }else if()
            
            System.out.println(nota);
            n.close(); //Cierre del teclado n
    }
}