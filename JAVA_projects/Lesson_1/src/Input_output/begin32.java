package Input_output;

import java.util.Scanner;

public class begin32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tc=");
        double Tc = sc.nextDouble();

        double Tf = (Tc * 9 / 5) + 32;


        System.out.format("%.2f(Tc) = %.2f(Tf)", Tc, Tf);

    }
}
