package com.uzduotis7;

import java.util.Scanner;

/**
 * Created by User on 2017-03-04.
 */
public class Uzduotis7 {
    public Uzduotis7() {
        //       Realizuoti 1.6. užduotį panaudojant metodą, kurio parametrai būtų masė ir svoris, o
        //       grąžinama reikšmė, kūno masės indeksas.
        System.out.println("Ši programa apskaičiuos tavo kūno masės indeksą - KMI.");
        System.out.println("Įvesk savo ūgį metrais, su kableliu");
        Scanner sc = new Scanner(System.in);
        double ugis = sc.nextDouble();
        System.out.println("Dabar įvesk savo svorį, kilogramais");
        double svoris = sc.nextDouble();

        kmi(ugis, svoris);
        System.out.print("Tavo kūno masės indeksas yra "+kmi(ugis, svoris));
    }
        public static double kmi(double ugis, double svoris){
        double indeksas = svoris/(Math.pow(ugis, 2));
        return(indeksas);
    }
}

