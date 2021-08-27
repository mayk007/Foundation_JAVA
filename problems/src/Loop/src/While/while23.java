package Loop.src.While;

import java.util.Scanner;

public class while23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int i = 1;
        int EKUB = 0;

        while (i<=a && i<=b) {

            if (a % i == 0 && b % i ==0) {
                EKUB = i;
            }
            i++;
        }
        System.out.println("EKUB: " + EKUB);

    }
}
