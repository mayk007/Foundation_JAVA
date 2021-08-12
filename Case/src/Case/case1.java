package Case;

import java.util.Scanner;

public class case1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1<=a <=7, a = ");
        int a = sc.nextInt();

        switch (a){

            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;

            default: System.out.println("Bunday hafta kuni yo'q!");
        }

    }
}
