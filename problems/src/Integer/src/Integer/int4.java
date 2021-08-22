package Integer;

import java.util.Scanner;

public class int4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(A>B)");
        System.out.print("A = ");
        short A = sc.nextShort();
        System.out.print("B = ");
        short B = sc.nextShort();

        int result = A / B;

        System.out.printf("B kesma A kesmada to'liq %d marta joylashadi.", result);

    }
}
