package com.sergisvk.Ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio5 {

    public Ejercicio5(){
        CentroSalud centroSalud = new CentroSalud();

        centroSalud.addPaciente("Paciente 0", new GregorianCalendar(2015, Calendar.FEBRUARY, 1), 'F', 1.63f, 57f);
        centroSalud.addPaciente("Paciente 1", new GregorianCalendar(2001, Calendar.MAY, 2), 'M', 1.8f, 67f);
        centroSalud.imprimirPacientes();

    }
}