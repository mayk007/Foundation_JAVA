package Function;

import java.util.Scanner;

public class FunSimple34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i, temp = n, sum = 0;

        while (n > 0) {

            i = n % 10;
            sum = (sum * 10) + i;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println(sum);
        else
            System.out.println("not palindrome");


    }
}
