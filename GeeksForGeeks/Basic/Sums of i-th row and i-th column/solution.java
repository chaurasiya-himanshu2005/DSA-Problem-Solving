class Solution {
    boolean sumOfRowCol(int A[][]) {

        int N = A.length;
        int M = A[0].length;

        int limit = Math.min(N, M);

        for (int i = 0; i < limit; i++) {
            int rowSum = 0;
            int colSum = 0;

            // Sum of ith row
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }

            // Sum of ith column
            for (int j = 0; j < N; j++) {
                colSum += A[j][i];
            }

            if (rowSum != colSum) {
                return false;
            }
        }

        return true;
    }
}