
public class task2 {
    static int fact(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }
    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
//output
//5P2 = 20