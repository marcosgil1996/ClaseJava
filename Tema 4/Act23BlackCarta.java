import java.util.*;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
 
        String otraCarta, jugarOtraVez = "y", ctn = null;
        int ProxCarta, card1, card2, dCard1, dCard2;
        int cardTotal = 0, dTotal = 0;
 
        Scanner teclado = new Scanner(System.in);
 
        Random rd = new rd();
 
        //El jugador empieza con dos cartas
 
        while ("y".equals(jugarOtraVez)) {
            // Dos cartas al azar
            dCard1 = rd.nextInt(10) + 1;
            dCard2 = rd.nextInt(10) + 1;
 
            //El primer jugador coge dos cartas aleatorio y la carta total
            card1 = rd.nextInt(10) + 1;
            card2 = rd.nextInt(10) + 1;
            cardTotal = card1 + card2;
 
            // Muestra el total de las cartas
            dTotal = dCard1 + dCard2;
            System.out.println("Muestra la carta: " + dCard1);
 
            // Muestra al jugador la primera y la segunda carta y la carta total 
            System.out.println("Total: " + cardTotal);
 
            System.out.println("Otra carta (y/n)?: ");
            otraCarta = teclado.nextLine();
 
            while ("y".equals(otraCarta)) {
                ProxCarta = rd.nextInt(10) + 1;
                cardTotal += ProxCarta;
                System.out.println("Carta: " + ProxCarta);
                System.out.println("Total: " + cardTotal);
 
                if (cardTotal > 21) {
                    System.out.println("You busted, Dealer wins");
                    System.out.println("Do you want to play again? (y/n):");
                    jugarOtraVez = teclado.nextLine();
                }
 
                if (cardTotal < 21)
                    System.out.println("Otra carta (y/n)?: ");
                 
                otraCarta = teclado.nextLine();
                 
                if ("n".equals(otraCarta))
                    System.out.println("Dealer had: " + dTotal);
                 
                System.out.println("You had: " + cardTotal);
 
                while ("n".equals(otraCarta)) {
                    if (dTotal < cardTotal && cardTotal < 21) {
                        System.out.println("¡Has ganado!");
                        System.out.println("jugar otra vez? (y/n): ");
                        jugarOtraVez = teclado.nextLine();
                         
                        if (jugarOtraVez.equalsIgnoreCase("y"))
                            jugarOtraVez = "y";
 
                        if (dTotal > cardTotal && dTotal < 21)
                            System.out.println("Has perdido!");
                         
                        jugarOtraVez = teclado.nextLine();
                    }
                }
            }
        }
    }
} 