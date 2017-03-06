package naujapamoka.uzduotis4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by User on 2017-03-06.
 */
public class Uzduotis4 {
    public Uzduotis4(){
        int skaicius=1;
        int suma=0;
        System.out.println("Labas, įvesk skaičių");

        while(skaicius!=0){
            try{
                Scanner sc= new Scanner(System.in);
                skaicius = sc.nextInt();
                suma+=skaicius;
                System.out.println(skaicius);
            }
            catch (InputMismatchException e){
                System.out.println("zodis netinka!");
            }
        }
        System.out.print("Programa baigta, suma lygi "+suma);
    }
}