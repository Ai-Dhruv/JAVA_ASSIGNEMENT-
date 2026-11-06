public class task3 {
    public static void main(String[] args) {

        int m[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int count = 0;

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {

                if(m[i][j] > 5) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than 5: " + count);
    }
}
//Output
// Values greater than 5: 4