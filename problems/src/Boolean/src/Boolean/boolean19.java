package Boolean;

import java.util.Scanner;

public class boolean19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A>0) A= ");
        int A = sc.nextInt();
        System.out.print("(B>0)B= ");
        int B = sc.nextInt();
        System.out.print("(C>0) C= ");
        int C = sc.nextInt();

       // boolean D = (A == -B) || (-A == C) || (B == -C) || (-A == B) || (A == -C) || (-B == C);

        // 2-usul
        boolean D = A + B == 0 || A + C == 0 || B + C == 0;

        System.out.println(D);

    }
}
