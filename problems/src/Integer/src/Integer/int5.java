package Integer;

import java.util.Scanner;

public class int5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(A>B>0)");
        System.out.print("A = ");
        short A = sc.nextShort();
        System.out.print("B = ");
        short B = sc.nextShort();

        int butun = A / B;
        int qoldiq = A%B;

        System.out.printf("A kesmada B kesmanig to'liq joylashgan qismi: %d", butun);
        System.out.printf("%nA kesmada B kesmanig joylashmagan qismi: %d", qoldiq);

    }
}
