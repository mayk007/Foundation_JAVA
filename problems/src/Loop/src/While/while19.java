package Loop.src.While;

import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int i = n;
        int sum = 0;
        int count = 0;
        while (n>0){

            i = n%10;
            n = n/10;
            sum += i;
            count++;
        }

        System.out.printf("Raqamlar yi'gindisi: %d \traqamalar soni %d ta", sum, count );
    }
}
