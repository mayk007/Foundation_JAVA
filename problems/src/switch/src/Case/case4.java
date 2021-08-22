package Case;

import java.util.Scanner;

public class case4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1>= M <= 12), M=");
        int M = sc.nextInt();

        switch (M) {
            case 1:
                System.out.println("Yanvar: 31 kun");
                break;
            case 2:
                System.out.println("Fevral: 28~29 kun");
                break;
            case 3:
                System.out.println("Mart: 31 kun");
                break;
            case 4:
                System.out.println("Aprel: 30 kun");
                break;
            case 5:
                System.out.println("May: 31 kun");
                break;
            case 6:
                System.out.println("Iyun: 30 kun");
                break;
            case 7:
                System.out.println("Iyul: 31 kun");
                break;
            case 8:
                System.out.println("Avgust: 31 kun");
                break;
            case 9:
                System.out.println("Septabr: 30 kun");
                break;
            case 10:
                System.out.println("Oktabr: 31 kun");
                break;
            case 11:
                System.out.println("Noyabr: 30 kun");
                break;
            case 12:
                System.out.println("Dekabr: 31 kun");
                break;

        }



    }
}
