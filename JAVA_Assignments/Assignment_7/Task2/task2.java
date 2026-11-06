public class task2 {
    public static void main(String[] args) {

        int steps = 0;

        // Time Complexity: O(n^2)
        for(int i = 1; i <= 10; i++) {

            for(int j = 1; j <= 10; j++) {
                steps++;
            }
        }

        System.out.println("Steps: " + steps);

    }
}

//output
// Steps: 100

