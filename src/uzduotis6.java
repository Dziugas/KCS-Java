import java.util.Scanner;

/**
 * Created by User on 2017-03-04.
 */
public class uzduotis6 {
    public static void main (String[] args){

        System.out.println("Labas, įvesk savo ūgį, metrais");

        Scanner sc = new Scanner(System.in);
        double ugis = sc.nextDouble();

        System.out.println("Dabar įvesk savo svorį, kilogramais");
        double svoris = sc.nextDouble();

        double KMI = svoris/(java.lang.Math.pow(ugis, 2));
        System.out.print("Kūno masės indeksas yra "+KMI);
//        KMI = masė (kg) / (ūgis(m))^2
    }
}
