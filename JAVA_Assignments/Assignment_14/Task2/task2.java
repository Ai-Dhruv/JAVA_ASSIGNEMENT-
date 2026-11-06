public class task2 {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}

//Output
// Count of g: 2