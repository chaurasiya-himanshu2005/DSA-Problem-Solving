class Solution {
    static int nthEvenFibonacci(int n) {
        // code here
        if(n == 1) return 2;
        if(n == 2) return 8;
        
        int a = 2, b = 8;
        
        for(int i = 3; i <= n; i++){
            int c = 4 * b + a;
            a = b;
            b = c;
        }
        
        return b;
    }
}