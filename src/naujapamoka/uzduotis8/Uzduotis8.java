package naujapamoka.uzduotis8;

import java.util.Scanner;

/**
 * Created by User on 2017-03-07.
 */
public class Uzduotis8 {
    int[] masyvas;

    public Uzduotis8() {
    }

    public void Spausdinimas(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println("Skaicius " + (i + 1) + " yra " + masyvas[i]);
            }
        }
    }
}
