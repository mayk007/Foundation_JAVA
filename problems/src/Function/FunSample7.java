package Function;

import java.util.Scanner;

public class FunSample7 {

    static void InvertDigit(int n){

        StringBuilder teskari = new StringBuilder("");

        while (n != 0){

            teskari.append(n % 10);
            n = n/10;
        }
        System.out.println(" teskari raqamlar tartibi  " + teskari);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a =  ");
        int a = sc.nextInt();
        System.out.print("b =  ");
        int b = sc.nextInt();
        System.out.print("c =  ");
        int c = sc.nextInt();

        System.out.print("a ning "); InvertDigit(a);
        System.out.print("b ning "); InvertDigit(b);
        System.out.print("c ning "); InvertDigit(c);

    }
}