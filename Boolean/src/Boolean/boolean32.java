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

        boolean D = (a * a + b * b) == c * c || (a * a + c * c) == b * b || a * a == (b * b + c * c);

        System.out.println(D);

    }
}
