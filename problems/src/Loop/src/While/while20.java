package Loop.src.While;

import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int i = n;

        while (n>0) {

            i = n % 10;
            n = n / 10;
            if (i == 2) {
                System.out.println("Raqamlar orasida 2 raqami bor!");
                break;
            }

        } if (i != 2) {
            System.out.println("Raqamlar orasida 2 raqami yo'q!");
        }
    }
}
