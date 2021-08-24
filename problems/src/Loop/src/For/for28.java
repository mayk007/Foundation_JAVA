package Loop.src.For;

import java.util.Scanner;

public class for28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("(n>0), n= ");
        int n = in.nextInt();
        System.out.print("|x|<1, x= ");
        double x = in.nextDouble();

        double Sum = 0;

        for (int i = 0; i < n; i++) {

            double surat = 1;
            double mahraj = 1;
            // suratda toq sonlar keladi
            for (int j=1; j<=2*i-3; j+=2){
                surat *= Math.pow(-1,i-1)*j;
            }
            // mahrajda 2 ga karrali juft sonlar keladi
            for (int k = 2; k <= 2*i; k+=2){
                mahraj *= k;
            }
            //surat darajasini hisoblash
            surat *= Math.pow(x,i);

            // oxirgi yig;uindini hisoblash
            Sum += surat/mahraj;
            System.out.println(Sum);
        }
        System.out.printf("Natija = %.4f",Sum);
    }
}
