package For;

import java.util.Scanner;

public class for8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(a<b), a= ");
        int a = in.nextInt();
        System.out.print("(b= ");
        int b = in.nextInt();

        int sum = 1;
        for (int i = a; i <= b; i++) {

            sum *= i;
        }
        System.out.println(sum);

    }
}
