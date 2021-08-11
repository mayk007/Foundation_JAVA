package Boolean;

import java.util.Scanner;

public class boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        // 1-usul
//        boolean D = (a * a + b * b) == c * c || (a * a + c * c) == b * b || a * a == (b * b + c * c);

        // 2-usul
        double a2, b2, c2;
        a2 = Math.pow(a, 2);
        b2 = Math.pow(b, 2);
        c2 = Math.pow(c, 2);

        boolean D = (a2 + b2) == c2 || (a2 + c2) == b2 || (b2 + c2) == a2;

        System.out.println(D);

    }
}
