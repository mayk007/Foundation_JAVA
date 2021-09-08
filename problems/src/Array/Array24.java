package Array;

public class Array24 {
    static int Arr(int[] arr) {

        int d = arr[1]-arr[0];
        int D = 0;

        for (int i = 1; i < arr.length; i++) {

            D = arr[i] - arr[i-1];

            if (D!=d){
                return 0;
            }
        }
       return D;
    }
    public static void main(String[] args) {

        int[] arr = new int[] {1, 3, 5, 7};

        int MyArray = Arr(arr);
        System.out.println("Natija: " + MyArray);
    }
}
