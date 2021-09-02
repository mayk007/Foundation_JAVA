package Function;

import java.util.Scanner;

public class FunSimple23 {
    static int Quater(int x, int y){

        if (x>0 && y>0){
            return 1;
        } else if (x<0 && y>0){
            return 2;
        } else if (x<0 && y<0){
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();

        System.out.print("y = ");
        int y = sc.nextInt();

        System.out.printf("%d-chorak", Quater(x,y));
    }
}
