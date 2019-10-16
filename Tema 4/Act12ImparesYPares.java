import java.io.*;

public class Act12ImparesYPares {

    /*
    Los números de 1 a 100 e indique a su lado:
    a) En todos los casos: si es par o impar
    b) Indicar aquellos que sean múltiplos de 5
    Al final se se tiene que mostrar un resumen donde aparezca, cuantos números pares hay y su
    suma, cuantos números impares hay y su suma y cuantos números múltiplos de 5 hay y su suma.
    */


	public static void main(String args[]) {
		int  impares, multi5, pares, sumapar, sumaim, sumamul;
		pares = 0;
		impares = 0;
		multi5 = 0;
		sumapar = 0;
		sumaim =0;
		sumamul =0;
        
		for (int i = 1; i <=100;i++) {
			if (i%2==0) {
                pares ++;
				System.out.print( " \t es par");
				sumapar+= i;

			} else {
                impares ++;
				System.out.print( "\t es impar");
				sumaim+= i;
			}
			if (i%5==0) {
                multi5 ++;
				System.out.print( i + "\t es multiplo de 5");
				sumamul+=i;
			}
		}

		System.out.println("La suma de todos los pares es" + sumapar );
		System.out.println("La suma de todos los impares es" + sumamul);
		System.out.println("La suma de todos los multiplos de 5 es " + sumaim);
		System.out.println("Pares encontrados totales "+ pares);
		System.out.println("Impares encontrados totales "+ impares);
		System.out.println("Multiplos de 5 encontrados totales "+multi5);
	}


}
