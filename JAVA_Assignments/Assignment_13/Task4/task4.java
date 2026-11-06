public class task4 {
    public static void main(String[] args) {
        String word = "abc";

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}

//output
// a
// ab
// abc
// b
// bc
// c