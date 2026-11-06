public class task3 {
    public static void main(String[] args) {

        int arr[] = {5, 12, 2, 14, 7};

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);

    }
}

//Output
//Count greater than 10: 2