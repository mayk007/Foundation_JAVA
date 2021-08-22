package Input_output;

import java.util.Scanner;

public class begin33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X(kg):  ");
        double X = sc.nextDouble();

        System.out.print("A(narx)=");
        double A = sc.nextDouble();

        // 1 kg konfet narxi
        double kg1 = A / X;

        System.out.print("Y(kg)=");
        double Y = sc.nextDouble();
        double Y1 = Y * kg1;

        System.out.format("1 kg konfet narxi %.2f so'm %.2f kg konfet narxi esa %.2f so'm turadi.", kg1, Y, Y1);



    }
}
