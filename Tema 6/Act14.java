import java.util.Scanner;

/**
 * Act14
 */
public class Act14 {
    
    public static void main(String[] args) {
        
    }

    public static void getmostrarMenu() {
        boolean salir = true;
        int opcion;

        while (salir) {
            Scanner teclado = new Scanner(System.in);
            //Menú Principal y interfaz de la calculadora
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println(" 1. Palabra más larga \n 2. Palabra más corta \n 3. Número de vocales ");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("0. SALIR");
            opcion = teclado.nextInt(); //Pedimos al scanner que nos lea la elección de usuario
            teclado.nextLine(); // Salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción de lectura de palabra más larga");

                    break;
            
                case 2:
                    System.out.println("Has selecccionado la opción de lectura más corta");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de numero de vocales");
                    break;
                default:
                    System.out.println("Has saleccionado un número no valido porfavor seleccione un numero de 0 a 3");
                    break;
            }

            teclado.close();

            
        }
    }
}