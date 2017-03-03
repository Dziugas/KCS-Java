import java.util.Scanner;

/**
 * Created by User on 2017-03-03.
 */
public class uzduotis2 {
    public static void main(String[] args){
        System.out.print("Ivesk zodi!");

        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        int ilgis = zodis.length();

        System.out.print("Zodzio ilgis yra "+ilgis);
    }

}
