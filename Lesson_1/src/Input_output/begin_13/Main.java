// Author: Bekhzod Mustafaev
// Sana: 03.08.2021


package Input_output.begin_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Pi = 3.14;
        System.out.println("(R1 > R2)\nR1= \nR2= ");
        int R1 = sc.nextInt();
        int R2 = sc.nextInt();


        double S1 = Pi * R1;
        double S2 = Pi * R2;
        double S3 = Pi*(R1-R2);


        System.out.println("S1=" + S1 + "\nS2=" +S2 + "\nS3=" + S3);



    }

}