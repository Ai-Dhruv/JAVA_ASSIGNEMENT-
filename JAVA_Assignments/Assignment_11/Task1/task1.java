import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8};

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        System.out.println("Sorted: " + Arrays.toString(arr));

    }
}
//Output
// Sorted: [1, 2, 4, 5, 8]