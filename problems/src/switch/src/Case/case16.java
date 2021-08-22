package Case;

import java.util.Scanner;

public class case16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n (20<=n<=69): ");
        int n = sc.nextInt();

//        final String empty = "";
//        final String[] X = {empty,  "Bir ", "Ikki ", "Uch ", "To'rt ", "Besh ", "Olti ",
//                            "Yetti ", "Sakkiz ", "To'qqiz "} ;
////        System.out.println(X[5]);
//
//        final String[] Y =  {
//                empty, "O'n ", "Yigirma ", "O'ttiz ", "Qirq ", "Ellik ",
//                "Oltmish ", "Yetmish ", "Sakson ", "To'qson "
//        };
//
//        // if 'Y' is zero
//        if (n == 0){
//            System.out.println("Zero");
//        }
//        // split 'Y' if it is more than 19
//        if (n >= 20 && n<=69){
//            System.out.println(Y[n/10] + X[n%10] + "Yosh!");
//        } else {
//            System.out.println("Iltimos 20 va 60 ralig'idagi sonni kiriting!");
//        }

        // 2-usul
        int x = n / 10; // o'nlik
        int y = n % 10; // birlik

        switch (x) {
            case 2: {
                if (y==0){
                    System.out.println("Yigirma");
                } else if (y==1){
                    System.out.println("Yigirma bir");
                }else if (y==2){
                    System.out.println("Yigirma ikki");
                }else if (y==3){
                    System.out.println("Yigirma uch");
                }else if (y==4){
                    System.out.println("Yigirma to'rt");
                }else if (y==5){
                    System.out.println("Yigirma besh");
                }else if (y==6){
                    System.out.println("Yigirma olti");
                }else if (y==7){
                    System.out.println("Yigirma yetti");
                }else if (y==8){
                    System.out.println("Yigirma sakkiz");
                }else if (y==9){
                    System.out.println("Yigirma to'qqiz");
                }
            }break;
            case 3:{
                if (y==0){
                    System.out.println("O'ttiz");
                } else if (y==1){
                    System.out.println("O'ttiz bir");
                }else if (y==2){
                    System.out.println("O'ttiz ikki");
                }else if (y==3){
                    System.out.println("O'ttiz uch");
                }else if (y==4){
                    System.out.println("O'ttiz to'rt");
                }else if (y==5){
                    System.out.println("O'ttiz besh");
                }else if (y==6){
                    System.out.println("O'ttiz olti");
                }else if (y==7){
                    System.out.println("O'ttiz yetti");
                }else if (y==8){
                    System.out.println("O'ttiz sakkiz");
                }else if (y==9) {
                    System.out.println("O'ttiz to'qqiz");
                }
            }break;
            case 4:{
                if (y==0){
                    System.out.println("Qirq");
                } else if (y==1){
                    System.out.println("Qirq bir");
                }else if (y==2){
                    System.out.println("Qirq ikki");
                }else if (y==3){
                    System.out.println("Qirq uch");
                }else if (y==4){
                    System.out.println("Qirq to'rt");
                }else if (y==5){
                    System.out.println("Qirq besh");
                }else if (y==6){
                    System.out.println("Qirq olti");
                }else if (y==7){
                    System.out.println("Qirq yetti");
                }else if (y==8){
                    System.out.println("Qirq sakkiz");
                }else if (y==9) {
                    System.out.println("Qirq to'qqiz");
                }
            }break;
            case 5:{
                if (y==0){
                    System.out.println("Ellik");
                } else if (y==1){
                    System.out.println("Ellik bir");
                }else if (y==2){
                    System.out.println("Ellik ikki");
                }else if (y==3){
                    System.out.println("Ellik uch");
                }else if (y==4){
                    System.out.println("Ellik to'rt");
                }else if (y==5){
                    System.out.println("Ellik besh");
                }else if (y==6){
                    System.out.println("Ellik olti");
                }else if (y==7){
                    System.out.println("Ellik yetti");
                }else if (y==8){
                    System.out.println("Ellik sakkiz");
                }else if (y==9) {
                    System.out.println("Ellik to'qqiz");
                }
            }break;
            case 6:{
                if (y==0){
                    System.out.println("Oltmish");
                } else if (y==1){
                    System.out.println("Oltmish bir");
                }else if (y==2){
                    System.out.println("Oltmish ikki");
                }else if (y==3){
                    System.out.println("Oltmish uch");
                }else if (y==4){
                    System.out.println("Oltmish to'rt");
                }else if (y==5){
                    System.out.println("Oltmish besh");
                }else if (y==6){
                    System.out.println("Oltmish olti");
                }else if (y==7){
                    System.out.println("Oltmish yetti");
                }else if (y==8){
                    System.out.println("Oltmish sakkiz");
                }else if (y==9) {
                    System.out.println("Oltmish to'qqiz");
                }
            }break;
        }
    }
}
