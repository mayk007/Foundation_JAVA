package Input_output;

import Input_output.begin_1.Main;

import java.util.Scanner;

public class begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A!=0) A= ");
        double A = sc.nextDouble();
        System.out.print("B= ");
        double B = sc.nextDouble();
        System.out.print("C= ");
        double C = sc.nextDouble();

        // Diskriminantni topish
        double D = Math.pow(B,2) - 4 * A * C;

        // X1,X2 nomalumlarni topish
        double X1 = (-B+Math.sqrt(D)) / (2 * A);
        double X2 = (-B-Math.sqrt(D)) / (2 * A);

        if (D <=0){
            System.out.println("x1 = " + (-B) + " sqrt" + D + "/" + (2*A));
            System.out.println("x1 = " + (-B) + " sqrt" + -(D) + "/" + (2*A));
        } else {
            System.out.print("\nX1 = "+ X1 + "\nX2 = "+ X2 );
        }
    }
}
