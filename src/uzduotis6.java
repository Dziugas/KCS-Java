import java.util.Scanner;

/**
 * Created by User on 2017-03-04.
 */
public class uzduotis6 {
    public static void main (String[] args){

        System.out.println("Ši programa apskaičiuos tavo kūno masės indeksą - KMI. Įvesk savo ūgį, metrais");

        Scanner sc = new Scanner(System.in);
        double ugis = sc.nextDouble();

        System.out.println("Dabar įvesk savo svorį, kilogramais");
        double svoris = sc.nextDouble();

        double KMI = svoris/(Math.pow(ugis, 2));
        System.out.print("Tavo kūno masės indeksas yra "+KMI);
//        KMI = masė (kg) / (ūgis(m))^2
    }
}
