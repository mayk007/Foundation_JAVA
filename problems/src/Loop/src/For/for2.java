package Loop.src.For;

import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a < b;\na= ");
        int a = in.nextInt();
        System.out.print("b= ");
        int b = in.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            count +=1;
            System.out.println(count + ")\t" + i);

        }
    }
}
