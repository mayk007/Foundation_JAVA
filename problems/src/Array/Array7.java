package Array;


public class Array7 {
    static void Arr(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println("arr[" + i + "]=" + arr[i]);
            }
        }


    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};

        Arr(arr);
    }
}
