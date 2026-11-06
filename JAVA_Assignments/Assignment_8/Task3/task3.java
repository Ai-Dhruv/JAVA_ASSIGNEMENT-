public class task3 {
    public static void main(String[] args) {

        int m[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < 3; i++) {

            int sum = 0;

            for(int j = 0; j < 3; j++) {
                sum = sum + m[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }

    }
}

//Output
// Row 1 sum: 6
// Row 2 sum: 15
// Row 3 sum: 24