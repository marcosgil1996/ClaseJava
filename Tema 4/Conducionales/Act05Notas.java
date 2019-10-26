//Escribe un programa que pida una calificación (entre cero y diez) y visualice su equivalente
//alfabético, según la siguiente tabla:

//Versión Normal

import java.util.Scanner;

public class Act05Notas {

    public enum Clasificacion{
        Insuficiente, Suficiente, Sobresaliente, Bien, Notable, ERROR
    }
    public static void main(String[] args) {
         Clasificacion nota; //Variables utilizadas para los datos que introduzca el usuario
         Scanner teclado = new Scanner(System.in);

            //Se piden los dos datos
            System.out.println("Introduce la nota deseada");
            n1 = teclado.nextInt(); //Ponemos nextDouble, ya que, las variables declaradas estan en double y son numero reales.
            teclado.nextLine();
            

            //Se compara
            switch (nota) {
                case 1: case 2: case 3: case 4:
                    nota = Clasificacion.Insuficiente;
                    break;
                case 5: 
                    nota = Clasificacion.Suficiente;
                    break;
                case 7: case 8:
                    nota = Clasificacion.Notable;
                     break;
                case 6:
                    nota = Clasificacion.Bien;
                    break;
                case 9: case 10:
                     nota = Clasificacion.Sobresaliente;
                    break;
                default:
                    nota = Nota.ERROR;

                }
            
            System.out.println(nota);
            n.close(); //Cierre del teclado n
    }
}