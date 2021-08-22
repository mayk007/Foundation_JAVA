package Integer;

import java.util.Scanner;

public class int29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, S1, S2, D, S3;

        System.out.print("A=");
        A = sc.nextInt();
        System.out.print("B=");
        B = sc.nextInt();
        System.out.print("C=");
        C = sc.nextInt();

        // to'gri to'rtburchakka eng ko'p joylashgan Kv soni
        S1 = (A / C) * (B / C);
        // Kv ning joylashmay qolga  qismi yuzasi
        S2 = (A * B) - S1 * C * C;

        System.out.printf("\nTomonlari %d ga %d to'gri to'rtburchakka eng ko'p joylashgan Kv soni: %d", A, B, S1);
        System.out.printf("\nKv ning joylashmay qolga  qismi yuzasi %d ga teng.", S2);
    }
}