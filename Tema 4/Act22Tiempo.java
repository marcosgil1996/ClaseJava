import java.util.Scanner;

public class Act22Tiempo {
	public static void main(String arg[]) {
        int hour;   // variables que vamos a necesitar
        Scanner teclado = new Scanner (System.in); //Scaner lectura
        boolean valido;
        
        
        do{
            System.out.print( "Introduce una hora" ); // número insertado en horas hasta un máx de 24h
            teclado.nextLine();
            hour = teclado.nextInt(); //numero introducido
            valido = hour<=23;
            
            
            if(!valido){
                System.out.print("Establezca una hora correcta");
                system.print.nextLine();
            }else(valido){
                System.out.print("hora correcta");
                system.print.nextLine();
            }
        }while (valido);

		System.out.println(" El valor introducido como " + hour+ " es correcto");
		teclado.close();
	}
}