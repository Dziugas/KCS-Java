package naujapamoka.uzduotis6;

import java.util.Scanner;

/**
 * Created by User on 2017-03-07.
 */
//ctrl+alt+l -> gražiai sulygiuoja kodą
public class Uzduotis6 {
    String[] masyvas;

    public Uzduotis6() {
        System.out.println("Sveiki, reikės įvesti keletą žodžių");
    }
    public void nuskaitymas() {
        System.out.println("Pirma įveskite masyvo ilgį");
        Scanner sc = new Scanner(System.in);
        int ilgis = sc.nextInt();
        masyvas = new String[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įveskite " + (i + 1) + " žodį");
            masyvas[i]=sc.next();//next vietoj nextLine - kitaip kažkodėl prašoka pirmą žodį
        }
    }
    public void spausdinimas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println((i + 1) + " žodis yra " + masyvas[i]);
        }
    }
}
