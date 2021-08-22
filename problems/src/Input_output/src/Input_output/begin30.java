package Input_output;

import java.util.Scanner;

public class begin30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" α(gradus) = α(radian) *  180°/Pi , (0 < a < 2Pi)");
        System.out.println("a=");
        int a = sc.nextInt();

        final double Pi = Math.PI;

        double a_grad = a * 180 / Pi;

        System.out.format("%d(rad) burchak qiymati %.3f(grad)ga teng!", a,a_grad);

    }
}
