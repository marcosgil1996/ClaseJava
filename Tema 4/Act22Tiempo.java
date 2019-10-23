import java.util.Scanner;//Importamos el escáner.


public class Act22{
    public static void main(String[] args) {
        int horas;//Variable que almacena las horas introducidas.
        int minutos;//Variable que almacena los minutos introducidos.
        int segundos;//Variable que almacena los segundos.
        boolean horasOK = false;//Variable booleana que almacenará si el número está bien o no.
        boolean minutosOK = false;//Variable booleana que almacenará si el número está bien o no.
        boolean segundosOK = false;//Variable booleana que almacenará si el número está bien o no.
        Scanner lector = new Scanner (System.in);//Declaramos el escáner.


        System.out.println("Introduce el número de segundos (0-60): ");//Pedimos por primera vez los segundos.
        segundos = Integer.parseInt(lector.nextLine());//Leemos los segundos.
        System.out.println("Introduce el número de minutos (0-60): ");//Pedimos por primera vez los minutos.
        minutos = Integer.parseInt(lector.nextLine());//Leemos los minutos.
        System.out.println("Introduce el número de horas (0-24): ");//Pedimos por primera vez las horas.
        horas = Integer.parseInt(lector.nextLine());//Leemos las horas.


        //Hacemos un bucle while, mientras que horasOK, minutosOK o segundosOK sean false el bucle se
        //seguirá haciendo, aunque gracias al condicional no volverá a pedir la fecha si ya se ha 
        //introducido correctamennte anteriormente.
        
        while (!horasOK || !minutosOK || !segundosOK){
            if (segundos > 60 || segundos < 0){
                System.out.println("Te has equivocado! Introduce el número de segundos (0-60): ");
                segundos = Integer.parseInt(lector.nextLine());
            }else{
                segundosOK = true;
            }
        
            if (minutos > 60 || minutos < 0){
                System.out.println("Te has equivocado! Introduce el número de minutos (0-60): ");
                minutos = Integer.parseInt(lector.nextLine());
            }else {
                minutosOK = true;
            }
            if (horas > 24 || horas < 0){
                System.out.println("Te has equivocado! Introduce el número de horas (0-24): ");
                horas = Integer.parseInt(lector.nextLine());
            }else{
                horasOK = true;
            }

        }
        //Sacamos por pantalla los resultados y cerramos el lector.
        System.out.println("La fecha correcta que has introducido es: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos"); 
        lector.close();

    }
}