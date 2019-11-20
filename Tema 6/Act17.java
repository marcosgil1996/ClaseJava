import java.util.Scanner;

/**
 * Act17 un progrma que solicite dos números enteros (ancho y alto)
 */
public class Act17 {

    public static void main(String[] args) {
        char c;
        int lineas,columnas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la largaría del rectangulo (numero): ");
        lineas = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingresa el alto del rectangulo (numero): ");
        columnas = Integer.parseInt(teclado.nextLine());
        teclado.close();
    }
   public  void getRectangulo(int lineas, int columnas, String caracter) {
       for (i =0; i < lineas; i++){
           getimprimir(columnas, caracter);
           
       }
       
   }

   public void  getimprimir(int nveces, char c){
       for(int i =0; i<nveces; i++){
           System.out.print(c);
       }
   }

}