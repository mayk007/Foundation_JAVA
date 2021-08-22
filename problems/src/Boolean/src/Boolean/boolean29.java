package Boolean;

import java.util.Scanner;

public class boolean29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, x1, y1, x2, y2;
        System.out.print("x = ");
        x = sc.nextInt();
        System.out.print("y = ");
        y = sc.nextInt();
        System.out.print("x1 = ");
        x1 = sc.nextInt();
        System.out.print("y1 = ");
        y1 = sc.nextInt();
        System.out.print("x2 = ");
        x2 = sc.nextInt();
        System.out.print("y2 = ");
        y2 = sc.nextInt();

//        boolean D = x1 < x && y < y1 && x < x2 && y > y2;
        boolean D = (x1 < x && x < x2) && (y2 < y && y < y1);

        System.out.println(D);

    }
}
