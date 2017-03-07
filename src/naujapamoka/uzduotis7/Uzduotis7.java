package naujapamoka.uzduotis7;

import java.util.Scanner;

/**
 * Created by User on 2017-03-07.
 */
public class Uzduotis7 {
    int[] masyvas;

    public Uzduotis7() {
    }
    public void nuskaitymas() {
        System.out.println("Labas, pasirink, kiek nori įvesti skaičių");
        Scanner sc = new Scanner(System.in);
        int ilgis = sc.nextInt();
        masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įvesk " + (i + 1) + " skaičių");
            masyvas[i] = sc.nextInt();
        }
    }
    public void spausdinimas() {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println("Skaicius " + (i + 1) + " yra " + masyvas[i]);
            }
        }
    }
}
