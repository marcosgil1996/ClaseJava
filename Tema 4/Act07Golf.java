import java.util.Scanner;

public class Act07Golf{

    public static void main(String[] args) {
        
        //Variables
        int edad;
        char socios;

        Scanner teclado = new Scanner(System.in);

        //Se piden los dos datos
        System.out.println("Inserte su edad para saber si posees un descuento"); // Pedimos su edad
        edad = teclado.nextInt(); 
        teclado.nextLine();
           

        //Se compara
        if(edad>=65){
            System.out.println( "Posees un descuento del 25%, tu precio final es de: " + 500*0.50 ); // Se descuenta un 50%

        }if(edad<18){
            System.out.println( "Si tu padre es socio puedes obtener un descuento de 35%, si no es socio de 25%: s/n" );
            socios = teclado.nextLine().toLoweCase().charAt(0);

            if(socios == ("s")){
                System.out.println( "Posees un descuento del 35%, tu precio final es de: " + 500*0.35 ); // Se descuenta un 35%
            } 
            if(socios == ("n")){
                System.out.println( "Posees un descuento del 25%, tu precio final es de: " + 500*0.25 ); // Se descuenta un 25%
            }
        }else{
            System.out.println( "No hay ningun decuento actualmente" ); // Sin descuentos
        }
    }
           
        
}