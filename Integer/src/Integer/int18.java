package Integer;

import java.util.Scanner;

public class int18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("4 xonali son kiriting (A>999): ");
        int A = sc.nextInt();

        int ming = (A / 1000) % 10;

        System.out.printf("Yuzliklar xonasidagi son: %d", ming);
    }
}
