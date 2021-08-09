package Integer;

import java.util.Scanner;

public class int29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, S1, S2, D, S3;

        System.out.println("A=");
        A = sc.nextInt();
        System.out.println("B=");
        B = sc.nextInt();
        System.out.println("C=");
        C = sc.nextInt();

        // tomonlari A B bo'lgan to'gri to'rtburchaking yuzi
        S1 = A * B;
        // kvadratning yuzi
        S2 = C * C;
        // to'gri to'rtburchakka eng ko'p joylashgan Kv soni 
        D = S1 / S2;
        // Kv ning joylashmay qolga  qismi yuzasi
        S3 = S1 % S2;

        System.out.printf("tomonlari A B bo'lgan to'gri to'rtburchaking yuzi: %d", S1);
        System.out.printf("\nKvadratning yuzi: %d", S2);
        System.out.printf("\nTo'gri to'rtburchakka eng ko'p joylashgan Kv soni: %d", D);
        System.out.printf("\n Kv ning joylashmay qolga  qismi yuzasi: %d", S3);


    }
}