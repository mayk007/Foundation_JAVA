package Case;

import java.util.Scanner;

public class case6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Uzunlik birliklari: \n1-desimetr, \n2-kilometr \n3-metr \n4-millimetr \n5-santimetr");
        System.out.println("Uzunlik birligini kiriting (1>=a<=5): ");
        int a = sc.nextInt();
        System.out.print("Kesma uzunligini kiriting: ");
        double ku = sc.nextDouble();

        switch (a) {
            case 1 -> System.out.println(ku + "dm = " + (ku / 10) + "m");
            case 2 -> System.out.println(ku + "km = " + (ku * 1000) + "m");
            case 3 -> System.out.println(ku + "m = " + (ku) + "m");
            case 4 -> System.out.println(ku + "mm = " + (ku / 1000) + "m");
            case 5 -> System.out.println(ku + "cm = " + (ku / 100) + "m");
            default -> System.out.println("Bunday uzunlik birligi yo'q");
        }




    }
}
