public class task1 {
    static int fact(int n) {
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static void main(String[] args) {
        System.out.println("5C2 = "+ nCr(5, 2));
    }
}

//Output
// 5C2 = 10
