package com.sergisvk.Ejercicio5;
import java.util.GregorianCalendar;

public class Paciente {

    //Privadas
    private static int idAuto = 1;
    private int id;
    private String nombre;
    private GregorianCalendar fechaNacimiento;
    private char sexo;
    private float altura;
    private float peso;

    /**
     *
     * @param nombre de usuario
     * @param sexo M y H
     * @param altura en metros
     * @param peso Kg
     */
    public Paciente(String nombre, GregorianCalendar fechaNacimiento, char sexo, float altura, float peso) {
        this.id = idAuto++;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * EL IMG es la masa corporal del paciente
     * @return el peso dividido por la altura * altura
     */
    public float getIMC(){
        return peso/(altura*altura);
    }

    /**
     *la edad del usuario, La fecha actual en milisegundos será restado en con al fecha de nacimiento en millisegudos
     * @return la fecha en milisegundos
     */
    public int getEdad(){
        GregorianCalendar fechaActual = new GregorianCalendar();
        long difMillisegundos = fechaActual.getTimeInMillis()-fechaNacimiento.getTimeInMillis();
        return (int)(((((difMillisegundos /1000)/60)/60)/24)/365.25);
    }

    /**
     * Según el peso asignará un tipo de respuesta
     * @return el dato según la tabla
     */
    public String getIMCMessage(){
        float imc = getIMC();
        if(imc < 18.5){
            return "Peso insuficiente";
        } else if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        } else if(imc >= 25 && imc <= 26.9){
            return "Sobrepeso grado I";
        } else if(imc >= 27 && imc <= 29.9){
            return "Sobrepeso grado II";
        } else if(imc > 29.9){
            return "Sobrepeso grado III";
        } else {
            return "ERROR introduce bien los datos";
        }
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

}
