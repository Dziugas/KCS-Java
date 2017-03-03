import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class uzduotis4 {
    public static void main(String[] args) {
        System.out.println("Ivesk pirma skaiciu");

        Scanner sc = new Scanner(System.in);
        int skaicius1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int skaicius2 = sc.nextInt();

        skaiciuotiSuma(skaicius1, skaicius2);
        skaiciuotiSkirtuma(skaicius1, skaicius2);

        System.out.print("Siu skaiciu suma = " + skaiciuotiSuma(skaicius1, skaicius2) + ", o skirtumas = " + skaiciuotiSkirtuma(skaicius1, skaicius2));
    }

        public static int skaiciuotiSuma(int skaicius1, int skaicius2){
            int suma = skaicius1+skaicius2;
            return (suma);
        }

        public static int skaiciuotiSkirtuma(int skaicius1, int skaicius2) {
            int skirtumas = skaicius1 - skaicius2;
            return(skirtumas);
        }
    }
