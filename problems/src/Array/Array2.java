package Array;


public class Array2 {
    static void Arr(int[] n) {

        double daraja = 0;
        for (int i = 0; i < n.length; i++) {
           daraja =  Math.pow(2,i);
           System.out.println("2(" + i + ") = " + (int)(daraja));
        }
    }


    public static void main(String[] args) {

        int[] n = new int[10];

        Arr(n);
    }
}
