package Loop.src.While;

import java.util.Scanner;

public class while13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(a>1), a = ");
        int a = sc.nextInt();

        double i = 0;
        double sum = 0;

        while (i >= 0) {

            i++;
            sum += 1 / i;
            System.out.println((int)(i) + " = " + sum);

            if (sum >= a) {
                break;
            }
        }
        System.out.println("k = " + i);
    }
}
