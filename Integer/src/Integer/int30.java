package Integer;

import java.util.Scanner;

public class int30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("yilni kiriting:  ");
        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.print(a / 100 );
        } else{
            System.out.println(a / 100 + 1);
        }

    }
}
