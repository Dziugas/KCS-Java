package com.uzduotis1;

import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class Uzduotis1 {
    public Uzduotis1(){
        System.out.println("Ivesk savo varda");
        Scanner sc= new Scanner(System.in);
        String vardas= sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("tavo vardas yra "+vardas);
        }
    }
}
