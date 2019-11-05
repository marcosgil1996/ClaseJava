import java.util.Scanner;

/**
 * Act2 Escribe un programa que solicite hora, minutos y segundos y la muestre con formato hh:mm:ss.
 *Por ejemplo, para h=3, m=14 y s=4 deberá mostrar → 03:14:04
 */
import java.util.Scanner;//Importamos el escáner.
public class Act2{
    public static void main(String[] args) {
        int horas = 61;//Variable que almacenará las horas.
        int minutos = 61;//Variable que almacenará los minutos.
        int segundos = 61;//Variable que almacenará los segundos.
        boolean valido = false;
        Scanner lector = new Scanner (System.in);//Declaramos el escáner.
        do{
            if(horas > 24 || horas < 0){
                System.out.println("Introduce las horas: ");//Pedimos las horas por pantalla.
                horas = Integer.parseInt(lector.nextLine());//Leemos las horas y consumimos retorno de carro.
            }else{
                valido = true;
            }
        }while(!valido);
        valido=false;
        do{
            if(minutos > 60 || minutos < 0){
                System.out.println("Introduce los minutos: ");//Pedimos los minutos por pantalla.
                minutos = Integer.parseInt(lector.nextLine());//Leemos los minutos y consumimos retorno de carro.
            }else{
                valido = true;
            }
        }while(!valido);
        valido = false;
        do{
            if(segundos > 60 || segundos < 0){
                System.out.println("Introduce los segundos: ");//Pedimos los minutos por pantalla.
                segundos = Integer.parseInt(lector.nextLine());//Leemos los minutos y consumimos retorno de carro.
            }else{
                valido = true;
            }
        }while(!valido);
        //Mostramos la fecha introducida diciéndole que rellene lo que falte con 0s, solo mostrar 2 cifras y es un int (d).
        System.out.printf("La hora que has introducido es: %02d:%02d:%02d %n ", horas, minutos, segundos);
        lector.close();//Cerramos el lector.
    }
}