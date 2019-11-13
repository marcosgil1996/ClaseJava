/**
 * Act2 Escribe un programa que calcule el área y la longitud de una circunferencia en función del radio
 * (leído desde teclado). Hay que escribir un método para calcular el área y otro para la longitud.
 */
import java.util.Scanner;

public class Act02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        double radio;
        double area, longitud;
        System.out.print("Radio: ");
        radio = teclado.nextInt();
        area = area(radio);
        longitud = lontigud(radio);
        System.out.println("El area de una circunferencia de radio" + radio + "es " + area);
  
       teclado.close();
    }
    /**
     * 
     * @param radio
     * @return
     */
    public static double lontigud(double radio) {
        return 2* Math.PI;
        
    }
    public static double area(double radio) {
        return 2* Math.PI* radio;
        
    }
}