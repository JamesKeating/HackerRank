public class LogN_Fibonacci {

    private static int fibonacciNumber(int n) {
        int[][] A = {{1,1},{1,0}};
        if (n == 0)
            return 0;
        power(A, n-1);
        return A[0][0];
    }

    /*
     * Helper function that multiplies 2 matrices X and Y of size 2x2, and puts
     * the multiplication result back in X[][]
     */
    private static void multiply(int X[][], int Y[][]) {
        int x = X[0][0] * Y[0][0] + X[0][1] * Y[1][0];
        int y = X[0][0] * Y[0][1] + X[0][1] * Y[1][1];
        int z = X[1][0] * Y[0][0] + X[1][1] * Y[1][0];
        int w = X[1][0] * Y[0][1] + X[1][1] * Y[1][1];
        X[0][0] = x;
        X[0][1] = y;
        X[1][0] = z;
        X[1][1] = w;
    }

    /*
     * Helper function that calculates X[][] raise to the power n and puts the
     * result in X[][]
     */
    private static void power(int X[][], int n) {
        if(n < 2)
            return;

        int[][] M = {{1,1}, {1,0}};
        power(X, n/2);
        multiply(X, X);

        if (n % 2 > 0)
            multiply(X, M);

    }

    public static void main(String[] args) {
        System.out.print(fibonacciNumber(9));
    }

}
