public class task3 {
    public static void main(String[] args) {
        int arr[] = {4, 9, 2, 9, 7};
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println("Repeated value: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        if(!found) {
            System.out.println("No repeated value");
        }

    }
}
//Output
// Repeated value: 9


