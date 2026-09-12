class Solution {
    int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    boolean isStrong(int N) {
        int temp = N;
        int sum = 0;

        while (N != 0) {
            int ld = N % 10;
            sum += factorial(ld);
            N /= 10;
        }

        return sum == temp;
    }
}
