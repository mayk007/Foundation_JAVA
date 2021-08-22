package Boolean;

import java.util.Scanner;

public class boolean5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A=");
        int A = sc.nextInt();
        System.out.print("B=");
        int B = sc.nextInt();

        Boolean C = (A >= 0 || B < (-2));

        System.out.println(C);

    }
}
