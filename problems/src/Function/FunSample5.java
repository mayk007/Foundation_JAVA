package Function;

import java.util.Scanner;

public class FunSample5 {

    static void RectPS(int x1, int y1, int x2, int y2) {

        int S, P, eni, boyi;

        eni = Math.abs(x1 - x2);
        boyi = Math.abs(y1 - y2);
        P = eni * 2 + boyi * 2;
        S = eni * boyi;

        System.out.println("To'gri to'rtburchak Perimetri =  " + P);
        System.out.println("To'gri to'rtburchak Yuzi =  " + S);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.print("x1 = ");
        x1 = sc.nextInt();

        System.out.print("y1 = ");
        y1 = sc.nextInt();

        System.out.print("x2 = ");
        x2 = sc.nextInt();

        System.out.print("y2 = ");
        y2 = sc.nextInt();

        // REctPS funksiyani chaqiramiz
        RectPS(x1,y1,x2,y2);

    }
}