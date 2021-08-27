package Loop.src.While;

import java.util.Scanner;

public class while16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soizni kiriting (0<p<50): ");
        int p = sc.nextInt();

        int kun1= 10;
        double foiz;
        double target = kun1 * 20;
        double sum = kun1;
        int i = 0;
        while (sum<=target){

            foiz = (sum/100)*p;
            sum +=foiz;
            i++;
            System.out.println(i + "-kun ==> " + sum);
        }
        System.out.println("Sprtchi "+ i + " kundan keyin " + (int)(sum) + " km yuguradi.");
    }
}
