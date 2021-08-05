// Author: Bekhzod Mustafaev
// Sana: 05.08.2021


package Input_output.begin_25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x= ");
        int x = input.nextInt();
        double y = 3*Math.pow(x,6)-6*Math.pow(x,2)-7;

        System.out.print("y=" + y);

    }
}