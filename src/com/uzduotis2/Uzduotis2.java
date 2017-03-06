package com.uzduotis2;

import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class Uzduotis2 {
    public Uzduotis2(){
        System.out.println("Ivesk zodi!");

        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        int ilgis = zodis.length();

        System.out.print("Zodzio ilgis yra "+ilgis+" simboliai");
    }

}
