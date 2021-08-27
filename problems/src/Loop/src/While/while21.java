package Loop.src.While;

import java.util.Scanner;

public class while21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int i = n;

        while (n>0) {

            i = n % 10;
            n = n / 10;
            if (i % 2 !=0) {
                System.out.println("Raqamlar orasida toq son bor!");
                break;
            }

        } if (i % 2 ==0) {
            System.out.println("Raqamlar orasida toq son yo'q!");
        }
    }
}
