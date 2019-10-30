import java.util.Scanner;

/**
 * Act2 Escribe un programa que solicite hora, minutos y segundos y la muestre con formato hh:mm:ss.
 *Por ejemplo, para h=3, m=14 y s=4 deberá mostrar → 03:14:04
 */
public class Act2 {

    public static void main(String[] args) {
        int horas;
        int minute;
        int segundos;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce las horas: ");
        horas = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce las minutos: ");
        minute = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce las segundos: ");
        segundos = Integer.parseInt(teclado.nextLine());
        System.out.printf("");
        teclado.close();
        


        
    }
}