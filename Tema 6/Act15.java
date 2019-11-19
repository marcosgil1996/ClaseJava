import java.util.Scanner;

/**
 * Act14
 */
public class Act15 {
    
    public  static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        getmostrarMenu();
    }

    public static void getmostrarMenu() {
        boolean ejecutando = true;
        int opcion = 0;

        do {
           
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
                    System.out.println("Has seleccionado la opción de lectura de palabra más larga" + palabraLarga());
                    break;
            
                case 2:
                    System.out.println("Has selecccionado la opción de lectura más corta" + getpalabraCorta());
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de numero de vocales");
                    System.out.println(numeroVocales());
                    break;
                default:
                    System.out.println("Has saleccionado un número no valido porfavor seleccione un numero de 0 a 3");
                    break;
            }
        } while(ejecutando);
    }
    
    /**
     * Palabra Larga
     * @return
     */
    public static String palabraLarga(){

        
        String primeraPalabra = "";
        String segundaPalabra = "";
        String terceraPalabra = "";
        int longFirstWord = 0;
        int longSecondWord = 0;
        int longThirdWord = 0;

        System.out.print("Introduce la primera palabra");
        primeraPalabra = teclado.nextLine();
        System.out.print("Introduce la segunda palabra");
        segundaPalabra = teclado.nextLine();
        System.out.print("Introduce la tercera palabra");
        terceraPalabra = teclado.nextLine();

        longFirstWord = primeraPalabra.length();
        longSecondWord = segundaPalabra.length();
        longThirdWord = terceraPalabra.length();

        if (longFirstWord > longSecondWord && longFirstWord > longThirdWord){
            return primeraPalabra;
        } else if(longSecondWord > longFirstWord && longSecondWord > longThirdWord){
            return segundaPalabra;
        }else{
            return terceraPalabra;
        }


    }
    public static String getPalabraCorta() {
        String primeraPalabra = "";
        String segundaPalabra = "";
        String terceraPalabra = "";
        int longFirstWord = 0;
        int longSecondWord = 0;
        int longThirdWord = 0;

        System.out.print("Introduce la primera palabra");
        primeraPalabra = teclado.nextLine();
        System.out.print("Introduce la segunda palabra");
        segundaPalabra = teclado.nextLine();
        System.out.print("Introduce la tercera palabra");
        terceraPalabra = teclado.nextLine();

        longFirstWord = primeraPalabra.length();
        longSecondWord = segundaPalabra.length();
        longThirdWord = terceraPalabra.length();

        if (longFirstWord > longSecondWord && longFirstWord > longThirdWord){
            return primeraPalabra;
        } else if(longSecondWord > longFirstWord && longSecondWord > longThirdWord){
            return segundaPalabra;
        }else{
            return terceraPalabra;
        }

    }

    /**
     * Contador de palabras
     * @return
     */
    public static int numeroVocales(){

    
        String palabra = "";
        int contadorVocales = 0;
       
        System.out.print("Introduce una palabra: ");
        palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();
    
        for (int i = 0; i < palabra.length(); i++){
            
            switch(palabra.charAt(i)){
                case 'a':
                case 'e':
                case 'i': 
                case 'o': 
                case 'u':
                case 'á': 
                case 'é':   
                case 'í':    
                case 'ó':
                case 'à':
                case 'è':
                case 'ò':
                case 'ì':
                case 'ù':
                case 'ú':
                   contadorVocales++;
                   break;
            }   
    
        }
        return contadorVocales;
    }

}