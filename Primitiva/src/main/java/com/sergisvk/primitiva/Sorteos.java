package com.sergisvk.primitiva;
import com.sergisvk.util.Lib;

import java.util.ArrayList;

public class Sorteos {

    private int nIdentificador;
    private ArrayList<Ticket> tickets;

    public Sorteos(int nIdentificador){
        this.nIdentificador = nIdentificador;
    }
    public int getnReferente() {
        return nIdentificador;
    }

    public void setnReferente(int nIdentificador) {
        this.nIdentificador = nIdentificador;
    }
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Ticket getTicket(){
        Ticket nuevo = new Ticket();

        nuevo.setIdSorteo(nIdentificador);
        nuevo.setReintegro(Lib.aleatorio(0,9));

        if (tickets.isEmpty()){
            nuevo.setSerieNumero(tickets.get(tickets.size()-1).getSerieNumero()+1);
        }
        return nuevo;
    }


}
