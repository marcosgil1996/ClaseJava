import java.util.Scanner; //importamos la clase Scanner

public class Practica{
    public static void main(String[] args) {
        //Variables que vamos a gastar
        int opcion; //opciones del menú
        int primerNumero, segundoNumero; //los valores que dará el usuario cuan vaya ha realizar las operaciones
        boolean salir= false;
        double resultado;

        //Invocamos el scanner
        Scanner teclado = new Scanner(system.in);
        
        while (!salir) {
            
            //Menú Principal
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n 5. RESTO DIVISIÓN");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("0. SALIR");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion) {
                case 0:
                    break;
                case 1: //Suma
                    System.out.println("Has saleccionado la Suma: \n Introduce el primer numero numero a sumar");
                    primerNumero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a sumar");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();
                    resultado = primerNumero + segundoNumero;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                case 2:
                    System.out.println("Has saleccionado Restar: \n Introduce el primer numero numero a restar");
                    primerNumero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a restar");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();
                    resultado = primerNumero - segundoNumero;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                case 3:
                    System.out.println("Has saleccionado la Multiplicar: \n Introduce el primer numero numero a multiplicar");
                    primerNumero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a multiplicar");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();
                    resultado = primerNumero * segundoNumero;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                case 4: 
                    System.out.println("Has saleccionado la Divisón: \n Introduce el primer numero numero a dividir");
                    primerNumero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a dividir");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();
                    resultado = primerNumero / segundoNumero;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                case 5:
                    System.out.println("Has saleccionado el Resto de la División: \n Introduce el primer numero numero a dividir");
                    primerNumero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a dividir");
                    segundoNumero = teclado.nextInt();
                    teclado.nextLine();
                    resultado = primerNumero % segundoNumero;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                default:
                    System.out.println("Has saleccionado un número no valido porfavor seleccione un numero de 0 a 5");
                 break;
                
            }


        }
    
        
    }
}