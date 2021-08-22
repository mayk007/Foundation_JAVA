package Input_output;

import java.util.Scanner;

public class begin31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tf=");
        double Tf = sc.nextDouble();

        double Tc = (Tf-32)*5/9;


        System.out.format("%.2f(Tf) = %.2f(Tc)", Tf, Tc);

    }
}
