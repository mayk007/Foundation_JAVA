package Boolean;

import java.util.Scanner;

public class boolean31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        boolean D = (a == b) || (b == c) || (a == c);

        System.out.println(D);
    }
}
