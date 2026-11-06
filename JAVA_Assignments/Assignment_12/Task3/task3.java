public class task3 {
    public static void main(String[] args) {

        int arr[] = {6, 5, 4, 3, 2, 1};

        int shifts = 0;

        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
                shifts++;
            }

            arr[j + 1] = key;
        }

        System.out.println("Shifts: " + shifts);

    }
}

//Output
// Shifts: 15