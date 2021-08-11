package Boolean;

import java.util.Scanner;

public class boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1 <= x <= 8), x= ");
        int x = sc.nextInt();
        System.out.print("(1 <= y <= 8), y= ");
        int y = sc.nextInt();

        boolean D = (x + y) % 2 != 0;

        System.out.println(D);

    }
}
