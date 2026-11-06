public class task1 {
    public static void main(String[] args) {

        int m[][] = new int[3][4];

        int num = 1;

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 4; j++) {
                m[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

    }
}

//Output
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12