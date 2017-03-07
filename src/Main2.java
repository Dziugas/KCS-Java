/**
 * Created by User on 2017-03-06.
 */

import naujapamoka.uzduotis1.Uzduotis1;
import naujapamoka.uzduotis2.Uzduotis2;
import naujapamoka.uzduotis3.Uzduotis3;
import naujapamoka.uzduotis4.Uzduotis4;
import naujapamoka.uzduotis5.Uzduotis5;
import naujapamoka.uzduotis6.Uzduotis6;
import naujapamoka.uzduotis7.Uzduotis7;
import naujapamoka.uzduotis8.Uzduotis8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //   Uzduotis1 uzduotis1 = new Uzduotis1();
        //   Uzduotis2 uzduotis2 = new Uzduotis2();
        //   Uzduotis3 uzduotis3 = new Uzduotis3();
        //   Uzduotis4 uzduotis4 = new Uzduotis4();
        //   Uzduotis5 uzduotis5 = new Uzduotis5();
        //   uzduotis5.nuskaitymas();
        //   uzduotis5.skaiciavimas();
        //   Uzduotis6 uzduotis6 = new Uzduotis6();
        //   uzduotis6.nuskaitymas();
        //   uzduotis6.spausdinimas();
        //   Uzduotis7 uzduotis7 = new Uzduotis7();
        //   uzduotis7.nuskaitymas();
        //   uzduotis7.spausdinimas();

        Uzduotis8 uzduotis8 = new Uzduotis8();
        int[] masyvas = new int[5];
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įvesk " + (i + 1) + " skaičių");
            masyvas[i] = sc.nextInt();
        }
            uzduotis8.Spausdinimas(masyvas);

    }
}
