package Function;

import java.util.Scanner;

public class FunSimple46 {
    static int EKUB(int a, int b) {

        int ekub = 0;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i ==0 && b % i == 0){
                ekub = i;
            }

        }
        return ekub;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.print("d = ");
        int d = sc.nextInt();

        System.out.printf("\n%d va %d sonlarinign eng katta umumiy bo'luvchisi: %d ", a, b, EKUB(a, b));
        System.out.printf("\n%d va %d sonlarinign eng katta umumiy bo'luvchisi: %d ", a, c, EKUB(a, c));
        System.out.printf("\n%d va %d sonlarinign eng katta umumiy bo'luvchisi: %d ", a, d, EKUB(a, d));

    }
}
