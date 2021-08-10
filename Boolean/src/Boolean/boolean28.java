package Boolean;

import java.util.Scanner;

public class boolean28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("(y = ");
        int y = sc.nextInt();


        boolean D = x > 0 && y > 0 || x < 0 && y < 0;

        System.out.println(D);

    }
}
