package Condition;

import java.util.Scanner;

public class if12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("b= ");
        int c = sc.nextInt();
        // 1-usul
//        if (a < b && a < c){
//            System.out.println(a);
//        } else if (a>b && b < c){
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

//        // 2-usul
//        int D = Math.min(a,b);
//        if (c < D){
//            System.out.println(c);
//        } else {
//            System.out.println(D);
//        }

        // 3-usul
//        int D = Math.min(a,b);
//
//        int E = (c < D)? c:D;
//        System.out.println(E);

        // 4-usul
//        int F = Math.min(a,b) > c ? c:Math.min(a,b);
//        System.out.println(F);

      // 5-usul
        int F = (a<b)? Math.min(a,c):Math.min(b,c);
        System.out.println(F);
    }
}
