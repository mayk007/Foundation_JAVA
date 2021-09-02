package Function;

import java.util.Scanner;

public class FunSimple21 {
    static int SumRangeA(int a, int b){

        if (a>b){return 0;}

        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.printf("%d dan %d gacha sonlar yig'indisi %d ",a, b, SumRangeA(a,b));
        System.out.printf("\n%d dan %d gacha sonlar yig'indisi %d ",b, c, SumRangeA(b,c));

    }
}
