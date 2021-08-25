package Loop.src.While;

import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(n>1), n = ");
        int n = sc.nextInt();

        int i= 1;
        int sum = 1;

        while (i>0){

            i++;
            System.out.print(sum);
            sum += i;
            System.out.println("+"+i+"="+sum);

            if (sum>=n){
                break;
            }
        }
        System.out.println(i);
    }
}
