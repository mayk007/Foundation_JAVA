package Boolean;

import java.util.Scanner;

public class boolean24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.print("(A != 0) A= ");
        A = sc.nextInt();
        System.out.print("B= ");
        B = sc.nextInt();
        System.out.print("C= ");
        C = sc.nextInt();

        double D  = (B * B) - (4 * A * C);
        boolean S = (D >= 0);

        System.out.println(S);

    }
}
