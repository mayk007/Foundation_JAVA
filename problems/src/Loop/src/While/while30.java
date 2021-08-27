package Loop.src.While;

import java.util.Scanner;

public class while30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();
        System.out.print("B= ");
        int B = sc.nextInt();
        System.out.print("C= ");
        int C = sc.nextInt();

        int AB = A*B;
        int count = 0;
        while (AB >= C*C) {

            AB = AB - C*C;
            count++;
        }
        System.out.println("Natija: " + count);
    }
}
