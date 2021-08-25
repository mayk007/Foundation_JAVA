package Loop.src.While;
import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>0), n=");
        int n = sc.nextInt();

        int i = 0;
        int son = 0;

        while (i>=0){
            i++;
            son = i*i;
            if (son>n) break;
        }
        System.out.printf("Kvadrati %d dan katta bo'lmagan eng katta butun son bu: %d", n, i-1);

    }
}
