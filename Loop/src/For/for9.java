package For;

import java.util.Scanner;

public class for9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(a<b), a= ");
        int a = in.nextInt();
        System.out.print("(b= ");
        int b = in.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {

            sum += i*i;
            System.out.println(i + "*" +i +"="+ i*i);
        }
        System.out.println(sum);

    }
}
