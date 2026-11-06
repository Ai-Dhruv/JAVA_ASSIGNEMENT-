public class task2 {
    public static void main(String[] args) {

        int m[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int transpose[][] = new int[3][3];

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {
                transpose[j][i] = m[i][j];
            }
        }

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }

    }
}

//Output
// 1 4 7
// 2 5 8
// 3 6 9