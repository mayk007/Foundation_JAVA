package Function;

import java.util.Scanner;

public class FunSample4 {

   static void Triangle(double a, double b, double c){

       double P, S, p, h;

       // Teng tomonli uchburchak perimetri
       P = a + b + c;

       // Teng tomonli uchburchak yuzasi

       p = P/2; // yarim perimetr

       h = 2/a * Math.sqrt(p*(p-a)*(p-b)*(p-c)); // balandllikni topish

       S = a * h /2;

       System.out.println("Teng tomonli uchburchak Perimetri: " + P);
       System.out.println("Teng tomonli uchburchak Yuzasi: " + S);
   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.println("Uchburchak tomonlarini kiriting A=B=C");
        System.out.print("A = ");
        A = sc.nextDouble();

        System.out.print("B = ");
        B = sc.nextDouble();

        System.out.print("C = ");
        C = sc.nextDouble();

        Triangle(A,B,C);
    }
}