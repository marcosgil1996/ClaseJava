/**
 * Act9 un programa para representar los datos de una estación meteorológica. 
 */
import java.util.Scanner;

public class Act9 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);//Declaramos el escáner.

        //Presión en hPa
        float presion;
        //Probalidad de lluvia 0-100%
        float lluvia = 0;
        //UVI, entero
        float uvi = 0;

        //CIUDAD//
        String ciudad;
        System.out.println("Introduce la ciudad en la que se ecuentre");
        ciudad = Integer.parseInt(lector.nextLine());

        // PARTE DE LA HORAS //
        
        int horas;//Variable que almacena las horas introducidas.
        int minutos;//Variable que almacena los minutos introducidos.
        int segundos;//Variable que almacena los segundos.
        boolean horasOK = false;//Variable booleana que almacenará si el número está bien o no.
        boolean minutosOK = false;//Variable booleana que almacenará si el número está bien o no.
        boolean segundosOK = false;//Variable booleana que almacenará si el número está bien o no.
        


        System.out.println("Introduce el número en segundos:  ");//Pedimos por primera vez los segundos.
        segundos = Integer.parseInt(lector.nextLine());//Leemos los segundos.
        System.out.println("Introduce el número de minutos: ");//Pedimos por primera vez los minutos.
        minutos = Integer.parseInt(lector.nextLine());//Leemos los minutos.
        System.out.println("Introduce el número de horas: ");//Pedimos por primera vez las horas.
        horas = Integer.parseInt(lector.nextLine());//Leemos las horas.


        //Hacemos un bucle while, mientras que horasOK, minutosOK o segundosOK sean false el bucle se
        //seguirá haciendo, aunque gracias al condicional no volverá a pedir la fecha si ya se ha 
        //introducido correctamennte anteriorment. Mostrar → 03:14:04
        
        while (!horasOK || !minutosOK || !segundosOK){
            if (segundos > 60 || segundos < 0){
                System.out.println("Te has equivocado! Introduce un número en segundos: ");
                segundos = Integer.parseInt(lector.nextLine());
            }else{
                segundosOK = true;
            }
        
            if (minutos > 60 || minutos < 0){
                System.out.println("Te has equivocado! Introduce el número de minutos: ");
                minutos = Integer.parseInt(lector.nextLine());
            }else {
                minutosOK = true;
            }
            if (horas > 24 || horas < 0){
                System.out.println("Te has equivocado! Introduce el número de horas: ");
                horas = Integer.parseInt(lector.nextLine());
            }else{
                horasOK = true;
            }
        }

        //Velocidad del viento//
        float viento = 0;
        System.out.println("Introduce la velocidad del viento");
        viento = Integer.parseInt(lector.nextLine());
        
        //Velocidad

    
        
    
    }
        
}