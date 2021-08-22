package Loop.src.For;

import java.util.Scanner;

public class for21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();

        double factorial = 1;
        double Sum = 1;

        for (int i = 1; i <=n; i++) {
            factorial *=i;
            Sum += 1/factorial;
        }
        System.out.printf("1 + 1/(1!) ....1/(%d!) ifodadagi sonlar yig'indisi = %.2f",n , Sum);
    }
}

