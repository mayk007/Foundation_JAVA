package Integer;

import java.util.Scanner;

public class int8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ikki xonali sonni kiriting: ");
        short A = sc.nextShort();

        int onlikar = A / 10;
        int birliklar = A % 10;

        System.out.printf("teskari raqam: %d%d", birliklar, onlikar);


    }
}
