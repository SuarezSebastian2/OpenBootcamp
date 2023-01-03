package org.example;

public class Main {
    public static void main(String[] args) {

        //Punto 1
       int numeroIf = 0;

       if (numeroIf > 0){
           System.out.println("NumeroIf es Positivo");
       }if (numeroIf < 0){
            System.out.println("NumeroIf es Negativo");
        }if (numeroIf == 0){
            System.out.println("NumeroIf es 0");
        }

       //Punto 2
       int numeroWhile = 1;
       while (numeroWhile < 3){
           System.out.println("NumeroWhile es: "+numeroWhile);
           numeroWhile = numeroWhile + 1;
       }

       //Punto 3
       int numeroDoWhile = 2;
       do {
           System.out.println("NumeroDoWhile es: "+numeroDoWhile);
           numeroDoWhile = numeroDoWhile + 3;
       }while (numeroWhile < 3);

       //Punto 4
       for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
           System.out.println("NumeroFor es: "+numeroFor);
        }

       //Punto 5
       String Estacion = "Verano";
       //Verano, Invierno, Otoño, Primavera
       switch (Estacion){
           case "Verano":
               System.out.println("Verano");
               break;
           case "Invierno":
               System.out.println("Invierno");
               break;
           case "Otoño":
               System.out.println("Otoño");
               break;
           case "Primavera":
               System.out.println("Primavera");
               break;
           default:
               System.out.println(Estacion);
       }
    }
}