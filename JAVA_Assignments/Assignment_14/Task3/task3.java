public class task3 {
    public static void main(String[] args) {
        String s = "hello";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ": " + s.charAt(i));
        }
    }
}

//Output
// 0: h
// 1: e
// 2: l
// 3: l
// 4: o