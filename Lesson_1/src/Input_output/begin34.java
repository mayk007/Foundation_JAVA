package Input_output;

import java.util.Scanner;

public class begin34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X(kg) shokolad=");
        double X = sc.nextDouble();
        System.out.print("Y(kg) konfet=");
        double Y = sc.nextDouble();

        System.out.println("A>B");
        System.out.print("A(sum) shokolad=");
        double A = sc.nextDouble();
        System.out.print("B(sum) konfet=");
        double B = sc.nextDouble();

        // 1kg shokolad narxi
        double sh1 = A / X;
        // 1kg konfet narxi
        double K1 = B / Y;
        System.out.format("1kg shokolad %.2f so'm\n1kg konfet %.2f so'm", sh1, K1);
        System.out.println("\n1kg shokolad 1kg konfetdan " + (sh1 - K1) + " so'm qimmat turadi!");

    }
}
