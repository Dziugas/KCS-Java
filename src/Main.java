/**
 * Created by User on 2017-03-06.
 */

import com.HelloWorld.HelloWorld;
import com.uzduotis1.Uzduotis1;
import com.uzduotis2.Uzduotis2;
import com.uzduotis3.Uzduotis3;
import com.uzduotis4.Uzduotis4;
import com.uzduotis5.Uzduotis5;
import com.uzduotis6.Uzduotis6;
import com.uzduotis7.Uzduotis7;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Sveiki, įveskite skaičių nuo 1 iki 7");

        Scanner sc=new Scanner(System.in);
        int skaicius = sc.nextInt();
        switch(skaicius){
            case 1:
                Uzduotis1 uzduotis1 = new Uzduotis1();
            break;
            case 2:
                Uzduotis2 uzduotis2 = new Uzduotis2();
                break;
            case 3:
                Uzduotis3 uzduotis3 = new Uzduotis3();
                break;
            case 4:
                Uzduotis4 uzduotis4 = new Uzduotis4();
                break;
            case 5:
                Uzduotis5 uzduotis5 = new Uzduotis5();
                break;
            case 6:
                Uzduotis6 uzduotis6 = new Uzduotis6();
                break;
            case 7:
                Uzduotis7 uzduotis7 = new Uzduotis7();
                break;
            default:
                System.out.print("Netinkamas skaičius");
                break;

        }
       //Shift+F6 - kad pervadinti klasę visur
    }
}
