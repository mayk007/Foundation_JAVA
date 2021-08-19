package Case;

import java.util.Scanner;

public class case15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, R1, R2, S;

        System.out.println("\n1-g'isht a, \n2-olma \n3-chillak \n4-qarg'a");
        System.out.print("Karta turini kiriting (1<=M<=4): ");
        int M = sc.nextInt();
        System.out.print("Sonni kiriting (1>=n<=14): ");
        int n = sc.nextInt();

        String Karta_turi = "";
        String Karta_raqami = "";

        switch (M){
            case 1: Karta_turi += "G'isht"; break;
            case 2: Karta_turi += "Olma"; break;
            case 3: Karta_turi += "Chillak"; break;
            case 4: Karta_turi += "Qarg'a"; break;
            default: System.out.println("Bunday karta turi yo'q!");
        }

        switch (n) {
            case 1: Karta_raqami += 1; break;
            case 2: Karta_raqami += 2; break;
            case 3: Karta_raqami += 3; break;
            case 4: Karta_raqami += 4; break;
            case 5: Karta_raqami += 5; break;
            case 6: Karta_raqami += 6; break;
            case 7: Karta_raqami += 7; break;
            case 8: Karta_raqami += 8; break;
            case 9: Karta_raqami += 9; break;
            case 10: Karta_raqami += 10; break;
            case 11: Karta_raqami += "Valet"; break;
            case 12: Karta_raqami += "Dama"; break;
            case 13: Karta_raqami += "Karol"; break;
            case 14: Karta_raqami += "Tuz"; break;
            default: System.out.println("Bunday karta raqami mavjud emas!");
        }
        System.out.println("\n" + Karta_raqami + " " +  Karta_turi);
    }
}
