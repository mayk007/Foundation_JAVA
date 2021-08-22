
/* NOTE: Bir x o’zgaruvchili chiziqli tenglama deb ax=b (bu erda a va b – haqiqiy sonlar) ko’rinishidagi tenglamaga aytiladi.
 Bu yerda a – o’zgaruvchi oldidagi koeffitsient, b esa ozod had deyiladi.

ax = b chiziqli tenglama uchun uchta hol ro’y berishi mumkin:
1) a ≠ 0; bu holda tenglama ildizi  x = -b/a ga teng;
2) a=0, b=0; bu holda tenglama 0*x=0 ko’rinishga keladi va har qanday x da to’g’ri bo’ladi;
3) a=0, b≠0; bu holda tenglama 0*x=b ko’rinishga keladi va ildizga ega bo’lmaydi.
*/
package Input_output;
import java.util.Scanner;

public class begin38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A!=0), A= ");
        double A = sc.nextDouble();
        System.out.print("B= ");
        double B = sc.nextDouble();

        double x = -B/A;

        System.out.print("\nx =" + x);

    }
}
