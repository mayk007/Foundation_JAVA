package Boolean;

import java.util.Scanner;

public class boolean40 {
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

        // 'Ot' joylashgan o'rnidan  2 vertikal va 1 gorizontal (yoki teskarisi) va 2 gorizontal va 1 vertikal (yoki teskarsi) shaklda  yura oladi.

        boolean D = Math.abs(x1-x2) == 2 && Math.abs(y1-y2) == 1 || Math.abs(x1-x2) == 1 && Math.abs(y1-y2) == 2;

        System.out.println(D);

    }
}
