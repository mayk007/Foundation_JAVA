package Function;

import java.util.Scanner;

public class FunSimple22 {
    static void Calc(double a, double b, int Op) {

        switch (Op) {
            case 1 -> {
                System.out.printf("%.2f - %.2f = %.2f", a, b, (a - b));
            }
            case 2 -> {
                System.out.printf("%.2f * %.2f = %.2f", a, b, (a * b));
            }
            case 3 -> {
                System.out.printf("%.2f / %.2f = %.2f", a, b, (a / b));
            }
            case 4 -> {
                System.out.printf("%.2f + %.2f = %.2f", a, b, (a + b));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("(1-ayirish, 2-ko'paytirish, 3-bo'lish, 4-qo'shish), Amalni kiriting: ");
        int Op = sc.nextInt();

        Calc(a, b, Op);
    }
}
