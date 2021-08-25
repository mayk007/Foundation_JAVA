
package Loop.src.While;
import java.util.Scanner;

public class while9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>1), n=");
        int n = sc.nextInt();

        int i = 1;
        int count = 0;

        while (i<=n){

            i *= 3;
            count++;
        }
        System.out.println("Natija: " + (count) + "\nisbot 3^"+count+" > " + n);
    }
}
