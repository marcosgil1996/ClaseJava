import java.util.Scanner;

public class Segundos {
	public static void main(String arg[]) {
		int day, hour, minute, seconds, number;   // variables que vamos a necesitar
		Scanner teclado = new Scanner (System.in); //Scaner lectura
		
		System.out.print( "Introduce el número en segundos: " ); // número insertado
		number = teclado.nextInt(); //numero introducido
		teclado.nextLine();
		
		//seconds 0 = number - ((hour*3600) + (minute*60));
		//minute 0 =number 
		
		minute = number / 60;
		seconds = number % 60;
		hour = minute / 60;
		minute = minute % 60;
		day = hour / 24;
		hour = hour & 24;

		
		System.out.println(" El valor introducido como  " + number + ", en dias, horas, minutos y segundos: " + day + " días " + hour + " minutos " + minute + " minutos " + seconds + " segundos " );
		teclado.close();
	}
}