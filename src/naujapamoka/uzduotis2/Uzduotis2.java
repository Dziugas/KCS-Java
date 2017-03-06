package naujapamoka.uzduotis2;

import java.util.Scanner;

/**
 * Created by User on 2017-03-06.
 */
public class Uzduotis2 {
    public Uzduotis2 (){

        String zodis="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Labas");
        System.out.println("Įvesk žodį");
        while(!zodis.equals("pabaiga")){
            zodis = sc.nextLine();
            System.out.println(zodis);
            }
    }
}
