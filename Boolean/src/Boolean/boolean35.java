package Boolean;

import java.util.Scanner;

public class boolean35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();
        System.out.print("B= ");
        int B = sc.nextInt();
        System.out.print("C= ");
        int C = sc.nextInt();

        // 1-usul
//        double ab = Math.abs(A - B);
//        double ac = Math.abs(A - C);
//        double bc = Math.abs(B - C);
//        boolean D = ab == ac && ab == bc;

        // 2-usul
        boolean D = (A == B && B == C);

        System.out.println(D);

    }
}
