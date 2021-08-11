package Boolean;

import java.util.Scanner;

public class boolean36 {
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

        // shaxmatda Ruh vertikal va gorizontal tomonga xohlagan qadamda harakatlanadi.(ya'ni x1 va y1 o'qidan chiqib ketmasligi kerak)
        // 1-usul
        // boolean D =((x1 + y1) % 2 == 0 && x2 == x1 || (x1 + y1) % 2 == 0 &&  y2 == y1) || ((x1 + y1) % 2 != 0 && x2 == x1 || (x1 + y1) % 2 != 0 &&  y2 == y1);

        //optimized
        boolean D = (x2 == x1) || y2 == y1;
        System.out.println(D);

    }
}
