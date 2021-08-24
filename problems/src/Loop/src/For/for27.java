package Loop.src.For;

import java.util.Scanner;

public class for27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("|x|<1, x= ");
        double x = in.nextDouble();

        double Sum = 0;

        for (int i = 0; i < n; i++) {
            double mahraj = 1;
            double surat = 1;

            // suratda toq sonlar keladi
            for (int k=1; k<=2*i-1; k+=2){
                surat *= k;
            }
            // mahrajda 2 ga karrali juft sonlar keladi
            for (int j = 2; j <= 2*i; j+=2){
                mahraj *= j;
            }
            //surat darajasini hisoblash
            double y = Math.pow(x,2*i+1);

            // mahraj keyingi ifoda
            mahraj *= (2*i+1);

            // oxirgi yig;uindini hisoblash
            Sum += surat*y/mahraj;
            System.out.println(Sum);
        }
        System.out.printf("Natija = %.4f",Sum);
    }
}
