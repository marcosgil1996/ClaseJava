import java.util.Scanner;
import java.util.Random;

public class Act12b{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int cuantas;
        // el numero de calificaciones que va a sacar
        int max = 10;
        int min = 0; 
        //el numero maximo que puede sacar

        System.out.println("Cuantas notas quieres que calcule");
        cuantas= lector.nextInt();
        lector.nextLine();

        for(int i =1; i < cuantas; i++){
            System.out.println(metodoClase(metodoNotas(max,min)));
            // en este caso invocamos el metodo clase en primer lugar despues cuando tenemos la clase y antes de empezar el metodo invocamos la calse random para que nos de un numero y de esta manera pueda el bucle elegir.
        }
        lector.close();
    }
    public static int metodoNotas(int max ,int min){
        Random rnd = new Random();
        return rnd.nextInt(max-min+1)+min;
        //en este caso como no hay minimo sacara un umero maximo entre la resticcion que hemos puesto

    }
    public static String metodoClase(int numero) {
        //el nombre de la variable da igual
        String nota ="";
        if(numero >=0 && numero < 5){
            nota = "Insuficiente";
        }else if (numero >= 5 && numero < 6){
            nota = "Suficiente";

        }else if (numero >= 6 && numero < 7){
            nota = "Bien";
        }else if(numero >= 7 && numero < 9){
            nota="Notable";
        }else if(numero>=9 && numero <=10){
            nota ="Excelente";
        }
        return nota;
        // despues del bucle la nota elegida se gurdara aqui y la llevara al metodo principal
    }
}