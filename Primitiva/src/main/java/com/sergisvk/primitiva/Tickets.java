//Importes y Package
package com.sergisvk.primitiva;
import com.sergisvk.util.Lib;
import java.util.ArrayList;

public class Tickets {

    private ArrayList<Tickets> tickets;
    private ArrayList<Sorteos> GSorteos;

    private  int [] numeroSorteo;
    private int numeroAciertos;
    private int i,j;
    private  boolean repetido;

    public Tickets(){
        tickets = new ArrayList<>();
    }

    public void setGSorteos(ArrayList<Sorteos> GSorteos) {
        this.GSorteos = GSorteos;
    }


    /**
     *Generará tickets en cilos de 10k
     */
    public void generar(){
        for (int i =1; i<= 10000; i++){
            Sorteos ciclos10k = GSorteos.get(Lib.aleatorio(1,GSorteos.size()));
            boolean add = tickets.add(ciclos10k.getTicket());
        }
    }

    /**
     * @param numeroApuesta realizar por el juegar/CPU
     * @return el valor obtenido será el numero de Aciertos realizados
     */
    public int getNumeroAciertos(int[]numeroApuesta){
        for (i = 0; i< numeroSorteo.length; i++){
            for (j = 0; numeroSorteo.length > j; j++){
                if (numeroApuesta[i] == numeroSorteo[j])
                    numeroAciertos++;
            }
        }
        //return System.out.println(String.format("Aciertos: %d, Ticket: %s", numeroAciertos,numeroSorteo));
        return numeroAciertos;
    }

    /**
     * @param numeroApostado del jugador
     * @param numerosApuesta ticket
     * @return repetido en el caso que haya repetidos
     */
    public boolean comprobarApuesta(int numeroApostado, int[] numerosApuesta){
        for (i=0; i < numerosApuesta.length; i++){
            if (numeroApostado == numerosApuesta[i]){
                repetido = true;
                break;
            }else repetido = false;
        }
        return repetido;
    }

    public void setNumeroSorteo(int[] numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }
}
