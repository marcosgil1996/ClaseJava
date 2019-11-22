
import java.util.Scanner;
import java.util.Random;

public class Act23Black {

	public static void main(String Args[]) {
		
		/*Puntuaciones para el juego*/

		final int PUNTUACIONMAXIMA = 11;
		final int PUNTUACIONMAXIMAPORRAS = 5;

		boolean turnoOrdenador = false; 
		boolean turnoJugador = true;
		boolean cicloJuego = true; // Controla el juego

		int respuestaJugador = 0; // Input del jugador para el switch
		int puntuacionJugador = 0;
		int porrasJugador = 0;
		int resultadoJugador = 0;

		int puntuacionOrdenador = 0;
		int porrasOrdenador = 0;
		int resultadoOrdenador = 0;


		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("--- BLACKJACK ---");


		// Bucle principal del juego, resetea el resultado del ordenador al inicio de cada pasada.

		do {

			// Comprueba las porras del ordenador y termina el juego si tiene 5 o más.

			if(porrasOrdenador >= PUNTUACIONMAXIMAPORRAS){
				System.out.println("HAS PERDIDO LA PARTIDA GANA EL ORDENADOR");
				turnoJugador = false;
				turnoOrdenador = false;
				cicloJuego = false;
			}

			/*Bucle del jugador, lanza dados, muestra la puntuación actual o plantarse *
			 *el bucle termina si se planta o gana la partida */

			while(turnoJugador){
				System.out.println("1)LANZAR DADO");
				System.out.println("2)PLANTARSE");
				System.out.println("3)VER PUNTAUCION ACTUAL");

				respuestaJugador = scan.nextInt();
				scan.reset();

				// Comprueba las respuestas del jugador

				switch(respuestaJugador){
					case 1:
					puntuacionJugador = rnd.nextInt(6 - 1 + 1) + 1;
					resultadoJugador = resultadoJugador + puntuacionJugador;
					System.out.println("Has sacado un: " + puntuacionJugador);
					break;
					case 2:
					System.out.println("Te has plantado con: " + resultadoJugador);
					turnoJugador = false;
					turnoOrdenador = true;
					break;
					case 3:
					System.out.println("Tu puntuación es:"); 
					System.out.println("Turno actual: " + resultadoJugador);
					System.out.println("Porras totales: " + porrasJugador);
					break;
					default:
					System.out.println("Comando no válido, intenta otra vez");
					break;
				}

				if(resultadoJugador == PUNTUACIONMAXIMA){
					System.out.println("PUNTUACIÓN MÁXIMA \n \n ¡SUMAS 2 PORRAS!");
					porrasJugador = porrasJugador + 2;
					resultadoJugador = 0;

				}

				/*Si el jugador gana la partida, termina el programa en esta condición,*
				 *cerrando todos los bucles*/

				if(porrasJugador >= PUNTUACIONMAXIMAPORRAS){
					System.out.println("HAS GANADO LA PARTIDA");
					turnoJugador = false;
					turnoOrdenador = false;
					cicloJuego = false;

				}

				else if(resultadoJugador > PUNTUACIONMAXIMA) {
					System.out.println("TE HAS PASADO \n \n ¡EL ORDENADOR SUMA 1 PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
					resultadoJugador = 0;
				}

			}

			// Bucle del turno del ordenador, solo se activa en caso de que el jugador se plante.

			while(turnoOrdenador){
				System.out.println("ES EL TURNO DEL ORDENADOR");
			
				puntuacionOrdenador = rnd.nextInt(6 - 1 + 1) + 1;
				resultadoOrdenador = resultadoOrdenador + puntuacionOrdenador;
				System.out.println("ordenador -->" + resultadoOrdenador);


				if(resultadoOrdenador > PUNTUACIONMAXIMA){
					System.out.println("EL ORDENADOR SE HA PASADO! OBTIENES UNA PORRA!");
					porrasJugador = porrasJugador + 1;
					turnoOrdenador = false;
					turnoJugador = true;
					resultadoJugador = 0;
				}

				else if(resultadoOrdenador == PUNTUACIONMAXIMA){
					System.out.println("EL ORDENADOR HA SACADO LA PUNTUACIÓN MÁXIMA! SUMA DOS PORRAS!");
					porrasOrdenador = porrasOrdenador + 2;
					turnoOrdenador = false;
					turnoJugador = true;
					resultadoJugador = 0;
				}

				else if(resultadoOrdenador >= resultadoJugador){
					System.out.println("EL ORDENADOR HA IGUALADO O SUPERADO TU PUNTUACIÓN SUMA UNA PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
					turnoOrdenador = false;
					turnoJugador = true;
					resultadoJugador = 0;
				}
			}

			resultadoOrdenador = 0;

        } while(cicloJuego);
        scan.close();
	}
}

