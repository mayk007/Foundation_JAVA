package Integer;

import java.util.Scanner;

public class int7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ikki xonali sonni kiriting: ");
        short A = sc.nextShort();

        int onlikar = A / 10;
        int birliklar = A % 10;
        // yig'indi
        int sum = onlikar + birliklar;

        System.out.printf("O'nlikar %d ta ", onlikar);
        System.out.printf("%nBirliklar %d ta ", birliklar);
        System.out.printf("%nSummary: %d", sum );

    }
}
