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

        Veiksmas(skaicius1, skaicius2);
        Veiksmas(skaicius1, skaicius2);

        System.out.print("Siu skaiciu suma = " + Veiksmas(skaicius1, skaicius2) + ", o skirtumas = " + Veiksmas(skaicius1, skaicius2));
    }

    public static float Veiksmas(float skaicius1, float skaicius2){
        float suma = skaicius1+skaicius2;
        return (suma);
    }

    public static int Veiksmas(int skaicius1, int skaicius2) {
        int skirtumas = skaicius1 - skaicius2;
        return(skirtumas);
    }
}
