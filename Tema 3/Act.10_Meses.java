public class Meses {
    public enum Meses{ENERO, FEBERO, MARZO, ABRIL, MAYO, JUNIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
    public enum NotasMusicales{DO, RE, MI, FA, SOL , LA, SI}
    public enum Calificaciones{SUSPENSO, SUFICIENTE, BIEN,NOTABLE,SOBRESALIENTE}
    
    public static void  main(String[] args) {
        Meses c=meses.Enero;
        NotasMusicales d=NotasMusicales.Do;
        Calificaciones e=Calificaciones.NOTABLE;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }


}