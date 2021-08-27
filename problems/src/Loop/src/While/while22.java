package Loop.src.While;

import java.util.Scanner;

public class while22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>1), n = ");
        int n = sc.nextInt();

        int i = 2;
        int tub = 0;
        while (i<n) {

            tub = n % i;
            i++;
            if (tub == 0) {
                System.out.println("Tub son emas.");
                break;
            }

        } if (tub != 0) {
            System.out.println("Tub son!");
        }
    }
}
