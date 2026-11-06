import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        int arr[] = {14, 3, 9, 21, 6};

        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted: " + Arrays.toString(arr));

    }
}

//Output
// Sorted: [3, 6, 9, 14, 21]
