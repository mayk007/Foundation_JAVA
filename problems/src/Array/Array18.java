package Array;

public class Array18 {
    static int Arr(int[] arr) {

       int min = arr[arr.length-1];

        for (int i = arr.length-1; i >= 0; i--) {

            if (arr[i] < min){
                min = arr[i];
                return min;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr = new int[] {2,5,4,8,9,2,1,4,5,2};

        int my_array = Arr(arr);

        System.out.println("Natija: " + my_array);
    }
}
