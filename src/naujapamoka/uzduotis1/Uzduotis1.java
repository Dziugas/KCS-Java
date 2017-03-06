package naujapamoka.uzduotis1;

import java.util.Scanner;

/**
 * Created by User on 2017-03-06.
 */

//parašyti programą
public class Uzduotis1 {
    public Uzduotis1(){

        System.out.println("Labas, įvesk bet kokį skaičių");

        while(true){
            Scanner sc = new Scanner(System.in);
            int skaicius = sc.nextInt();

            if (skaicius%2==0)
            {
                System.out.println("skaicius yra lyginis");
            }
            else
            {
                System.out.println("Šis skaicius yra nelyginis");
            }
        }
    }
}
