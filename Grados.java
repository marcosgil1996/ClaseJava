public static void main(String[] args) {

    double precioLitro, litros = 0;
    double pagado, coste = 0;
    int kmIniciales, kmFinales, kilometros;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce el precio por litro: ");
    precioLitro = teclado.nextDouble();
    System.out.println("Introduce el coste total del primer repostaje:");
    pagado = teclado.nextDouble();
    System.out.println("Introduce el valor del cuenta kilometros en el primer repostaje: ");
    kmIniciales = teclado.nextInt();
    litros = pagado / precioLitro;
    coste = pagado;
    // SEGUNDO REPOSTAJE
    System.out.println("");
    System.out.println("Introduce el precio por litro del segundo repostaje: ");
    precioLitro = teclado.nextDouble();
    System.out.println("Introduce el coste total del segundo repostaje: ");
    pagado = teclado.nextDouble();
    litros += pagado / precioLitro;
    coste += pagado;
    //TERCER REPOSTAJE
    System.out.println("");
    System.out.println("Introduce el valor del cuentakilometros en el tercer repostaje: ");
    kmFinales = teclado.nextInt();
    kilometros = kmFinales - kmIniciales;

    //RESULTADOS
    System.out.println("El consumo medio del automóvil es de: " + (litros / kilometros) * 100
            + " litros por cada 100 km");
    System.out.println("El gasto medio es de " + coste / kilometros);

}

}
