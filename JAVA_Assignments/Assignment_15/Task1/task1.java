public class task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println(sb);
        System.out.println("Length: " + sb.length());
    }
}

//Output
// Hello World
// Length: 11