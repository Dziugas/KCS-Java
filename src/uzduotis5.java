import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class uzduotis5 {


    public static void main(String[] args) {
        System.out.println("Ivesk pirma skaiciu");

        Scanner sc = new Scanner(System.in);
        int skaicius1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int skaicius2 = sc.nextInt();

        Suma((float) skaicius1, (float) skaicius2);
        Suma2(skaicius1, skaicius2);
        Skirtumas((float) skaicius1, (float) skaicius2);
        Skirtumas2(skaicius1, skaicius2);

        System.out.print("Siu skaiciu float suma = " + Suma((float)skaicius1,(float)skaicius2) + ", float skirtumas = " + Skirtumas((float)skaicius1, (float)skaicius2));
        System.out.print("Siu skaiciu int suma = " + Suma2(skaicius1,skaicius2) + ", int skirtumas = " + Skirtumas2(skaicius1, skaicius2));
    }

    public static float Suma(float skaicius1, float skaicius2) {
        float suma = skaicius1 + skaicius2;
        return (suma);
    }

    public static float Skirtumas(float skaicius1, float skaicius2) {
        float skirtumas = skaicius1 - skaicius2;
        return(skirtumas);
    }

    public static int Skirtumas2(int skaicius1, int skaicius2) {
        int skirtumas = skaicius1 - skaicius2;
        return (skirtumas);
    }
    public static int Suma2(int skaicius1, int skaicius2) {
        int suma = skaicius1 + skaicius2;
        return(suma);
    }

}
