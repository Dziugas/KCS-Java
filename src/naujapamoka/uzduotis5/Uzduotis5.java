package naujapamoka.uzduotis5;

import java.util.Scanner;

/**
 * Created by User on 2017-03-06.
 */
public class Uzduotis5 {
    public Uzduotis5(){
        // paprašyti įvesti 5 skaičius
        //baigus skaičių įvedimą turi būti atvaizduojama visi įvesti skaičiai ir visų skaičių suma

        System.out.println("Labas, reikės įvesti 5 skaičius");
        Scanner sc = new Scanner(System.in);
        int[] masyvas = new int[5];

        for (int i = 0; i <masyvas.length ; i++) {
            System.out.println("Įveskite "+(i+1)+" skaičių, skaičius turi būti sveikasis");
            masyvas[i]=sc.nextInt();
        }
        int suma=0;
        for (int i = 0; i < masyvas.length ; i++) {
            System.out.println("Ivestas skaičius "+masyvas[i]);
            suma += masyvas[i];
        }
        System.out.print("Visų skaičių suma = "+suma);
    }
}
