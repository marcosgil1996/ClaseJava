import java.util.Scanner;

public class Edad {

        public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int edad;
      System.out.println("ingrese su edad: ");
      edad = teclado.nextInt();
      
      if(edad>=18){
          System.out.println("es mayor de edad");
      }
      else{
          System.out.println("es menor de edad");
      }
    }
    
}