package Case;

import java.util.Scanner;

public class case3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 >= Oy <= 12, Oyni kiriting: ");
        int Oy = sc.nextInt();

        switch (Oy)
        {
            case 3:
            case 4:
            case 5:
                System.out.println("Bahor!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yoz!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Kuz!");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Qish!");
                break;
            default:
                System.out.println("Oyni to'gri kiriting");


        }


    }
}
