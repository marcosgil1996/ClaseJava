import java.util.Scanner;

public class Act22Tiempo {
	public static void main(String arg[]) {
        int hour, minute, seconds, number;   // variables que vamos a necesitar
        Scanner teclado = new Scanner (System.in); //Scaner lectura
        double valido = false;
        valido = numero <=23;
        
        do{
            System.out.print( "Introduce una hora" ); // número insertado en horas hasta un máx de 24h
            number = teclado.nextInt(); //numero introducido
            
            teclado.nextLine();
            
            if(valido){
                System.out.print("Hora establecida de manera correcta");
            }else{
                System.out.print("Introduce una hora valida");
            }

        }while (!valido);
    
		

		
		System.out.println(" El valor introducido como");
		teclado.close();
	}
}
