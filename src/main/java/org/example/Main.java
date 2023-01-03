package org.example;

public class Main {
    public static void main(String[] args) {
        Coche cocheP = new Coche();

        int resultant;
        resultant = suma(20, 30, 2);

        System.out.println("El resultante de la suma es: "+resultant);

        cocheP.añadirPuerta();
        System.out.println("El numero de puertas del coche es de: "+cocheP.numeroPuertas);
        cocheP.añadirPuerta();
        System.out.println("El numero de puertas del coche es de: "+cocheP.numeroPuertas);
        cocheP.añadirPuerta();
        System.out.println("El numero de puertas del coche es de: "+cocheP.numeroPuertas);

    }


    public static int suma(int a, int b, int c) {
        return  a + b + c;
    }
}