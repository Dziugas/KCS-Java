package naujapamoka.uzduotis6;

import java.util.Scanner;

/**
 * Created by User on 2017-03-07.
 */
public class Uzduotis6 {
    public Uzduotis6(){
        String[] masyvas = new String[5];
        System.out.println("Sveiki, reikės įvesti 5 žodžius");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <masyvas.length ; i++) {
            System.out.println("Įveskite "+(i+1)+" žodį");
             masyvas[i] = sc.nextLine();
        }
        for (int i = 0; i <masyvas.length ; i++) {
            System.out.println((i+1)+" žodis yra "+masyvas[i]);
        }
    }
}
