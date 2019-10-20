import java.util.Scanner;

public class Act14Circulos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Declaro las variables ncesarias
        double radio;
        double longitud;
        double area;
        final float PI = 3.14159265359f;
        
        //pantalla
        System.out.println("Ingresar el radio de la circunferencia");
        radio = lector.nextDouble();
        lector.nextInt();
        
        //Calculos
        PI = 4;
        longitud = 2*PI*radio;
        area = radio*radio;
        



    }

}