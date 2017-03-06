package naujapamoka.uzduotis3;

import java.util.Scanner;

/**
 * Created by User on 2017-03-06.
 */
public class Uzduotis3 {
    public Uzduotis3(){
        int skaicius=1;
        int suma=0;
        System.out.println("Labas, įvesk skaičių");
        Scanner sc= new Scanner(System.in);
        while(skaicius!=0){
            skaicius = sc.nextInt();
            System.out.println(skaicius);
            suma=suma+skaicius;
    }
    System.out.print("suma lygi "+suma);
}
}
