public class task2 {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}

//output
// Reversed: avaJ
