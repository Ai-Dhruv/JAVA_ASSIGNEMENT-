
public class task3 {
    static int maxOf(int a, int b) {

        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println("Larger: " + maxOf(14, 9));

    }
}

//Output
// Larger: 14