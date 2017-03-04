import java.util.Scanner;

/**
 * Created by User on 2017-03-04.
 */
public class uzduotis7a {
    public void main(String[] args) {
        System.out.println("Ši programa apskaičiuos tavo kūno masės indeksą - KMI.");
        System.out.println("Įvesk savo ūgį metrais, su kableliu");
        Scanner sc = new Scanner(System.in);
        double ugis = sc.nextDouble();
        System.out.println("Dabar įvesk savo svorį, kilogramais");
        double svoris = sc.nextDouble();

        Skaiciavimas kmiIndeksas = new Skaiciavimas();
        kmiIndeksas.kmi(ugis, svoris);

        System.out.print("Tavo kūno masės indeksas yra "+kmiIndeksas.kmi(ugis, svoris));
    }

public class Skaiciavimas{
        public double kmi(double ugis, double svoris){
            double indeksas = svoris/(Math.pow(ugis, 2));
            return(indeksas);
        }
    }
}
