package Ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

    public Scanner teclado;

    public  Ejercicio7(){

        String[] array = {"Hola", null, "ola"};
        motrarArray();

    }

    public void motrarArray(){
        String[] array = new String[10];
        try {
            for (int i = 0; i <array.length ; i++) {
                System.out.println("Introduce la cadena de Array");
            }
        }catch (NullPointerException e){
            System.out.println("No introducas valores no validos");
        }

    }
}
