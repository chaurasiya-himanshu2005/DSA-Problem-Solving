class Solution {
    static int squaresInMatrix(int m, int n) {
        // code here
        int limit = Math.min(m, n);
        int total = 0;
        
        for(int i=1; i<=limit; i++){
            total += (m - i + 1) * (n - i + 1);
        }
        return total;
    }
};
