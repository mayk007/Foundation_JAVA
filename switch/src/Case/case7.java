package Case;

import java.util.Scanner;

public class case7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Og'irlik birliklari: \n1-kg, \n2-mg \n3-g \n4-t \n5-sentner");
        System.out.println("Og'irlik birligini kiriting (1>=a<=5): ");
        int a = sc.nextInt();
        System.out.print("Og'irlik qiymatini kiriting: ");
        double C = sc.nextDouble();

        // berilgan og'irlik kg da ifodalansin
        switch (a){
            case 1 -> System.out.println(C + "kg = " + C + "kg.");
            case 2 -> System.out.println(C + "mg = " + (C/1000000) + "kg.");
            case 3 -> System.out.println(C + "g = " + (C/1000) + "kg.");
            case 4 -> System.out.println(C + "t =" + (C*1000) + "kg.");
            case 5 -> System.out.println(C + "Ctr = " + (C*100) + "kg.");
            default -> System.out.println("Bunday og'irlik birligi yo'q!");

        }



    }
}
