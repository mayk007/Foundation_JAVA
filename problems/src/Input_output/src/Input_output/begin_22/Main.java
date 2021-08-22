// Author: Bekhzod Mustafaev
// Sana: 05.08.2021


package Input_output.begin_22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a= ");
        int a = input.nextInt();
        System.out.print("b= ");
        int b = input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("a=" + a + "\nb="+ b);

    }
}
