// Author: Bekhzod Mustafaev
// Sana: 05.08.2021


package Input_output.begin_23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a= ");
        int a = input.nextInt();

        System.out.print("b= ");
        int b = input.nextInt();

        System.out.print("c= ");
        int c = input.nextInt();

        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;

        System.out.print("a=" + a + "\nb="+ b + "\nc=" + c);

    }
}