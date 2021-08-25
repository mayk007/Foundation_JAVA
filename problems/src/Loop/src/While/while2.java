package Loop.src.While;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A>B), A=");
        int A = sc.nextInt();
        System.out.print("(B<A), B=");
        int B = sc.nextInt();

        int C = A;
        int count = 0;

        while (C-B>=0){

            C = C-B;
            count++;
        }
        System.out.println(B + " cm uzunlikdagi kesmani " + A + " cm Uzunlikdagi kesmada " + count + " marta joylashtirish mumkin!");

    }
}
