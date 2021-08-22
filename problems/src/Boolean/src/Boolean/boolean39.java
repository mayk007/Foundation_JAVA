package Boolean;

import java.util.Scanner;

public class boolean39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1 <= x1 <= 8), x1= ");
        int x1 = sc.nextInt();
        System.out.print("(1 <= y1 <= 8), y1= ");
        int y1 = sc.nextInt();
        System.out.print("(1 <= x2 <= 8), x2= ");
        int x2 = sc.nextInt();
        System.out.print("(1 <= y2 <= 8), y2= ");
        int y2 = sc.nextInt();

        // 'Farzin' joylashgan o'rnidan vertikal, gorizontal va dioganaliga xohlagancha qadamda yura oladi.
        boolean D = Math.abs(x1-x2) == Math.abs(y1-y2) || x1 == x2 || y1 == y2;

        System.out.println(D);

    }
}
