package com.sergisvk.tema9.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Log {
    //Java posee una clase para crear Logs que se llama Logger
    //java.util.logging.Logger;
    private enum LogType {
        CONSOLE, FILE, ALL
    }
    private static StringBuffer buffer = new StringBuffer();
    private static LogType destination = LogType.CONSOLE;
    private static final String DATE_FORMAT = "HH:mm yyyy-MM-dd";

    public static void d(String msg) {
        buffer.append(getDateTime()).append("\u001B[0;34mDEBUG: ").append(msg).append("\u001B[0m");
        print();
    }

    public static void e(String msg) {
        buffer.append(getDateTime()).append("\u001B[1;31mERROR: \u001B[0;31m").append(msg).append("\u001B[0m");
        print();
    }

    public static void e(Object clase, String msg) {
        String tag = clase.getClass().getName();
        buffer.append(getDateTime() + "("+ tag + ") \u001B[1;31mERROR: \u001B[0;31m" + msg + "\u001B[0m");
        print();
    }

    public static void e(Object clase, String msg, Exception e) {
        String tagClase = clase.getClass().getSimpleName();
        String tagPaquete = clase.getClass().getPackage().getName();
        buffer.append("\u001B[1;31mERROR:\u001B[0;31m in: \n");
        buffer.append("Package: ").append(tagPaquete).append("\n");
        buffer.append("Class: ").append(tagClase).append("\n");
        buffer.append("When: ").append(getDateTime()).append("\n");
        buffer.append("Message: ").append(msg).append("\n");
        StringWriter errors = new StringWriter();
        e.printStackTrace(new PrintWriter(errors));
        buffer.append("Exception stack trace: ").append(errors.toString()).append("\u001B[0m");
        print();
    }

    public static void i(String msg) {
        buffer.append(getDateTime()).append("\u001B[0;32mINFO: ").append(msg).append("\u001B[0m");
        print();
    }

    public static void o(String msg) {
        System.out.print(msg);
    }

    private static String getDateTime() {
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return "["+sdf.format(calendar.getTime())+"] ";
    }

    private static void print() {
        switch (destination) {
            case CONSOLE:
                System.out.println(buffer);
                buffer.setLength(0);
                break;
            case FILE:
                //Pendiente de implementar
                //Cuando veamos ficheros lo haremos
                break;
            case ALL:
                break;

        }
    }


}

