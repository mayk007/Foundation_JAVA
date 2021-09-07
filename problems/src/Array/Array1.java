package Array;


public class Array1 {
    static void Arr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0){
                System.out.println("arr[" + i + "]=" + i);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        Arr(arr);
    }
}
