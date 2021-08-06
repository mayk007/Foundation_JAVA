package Input_output;

import java.util.Scanner;

public class begin29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("α(radian) = α(gradus) * Pi / 180°, (0° < a < 360°)");
        System.out.print("a=");
        int a = sc.nextInt();

        final double Pi = Math.PI;

        double a_rad = a * Pi/180;

        System.out.format("%d(gradus) burchak qiymati %.2f(rad)ga teng!", a,a_rad);

    }
}
