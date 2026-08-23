class Solution {
    static int divisor(int n){
        int s = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) s += i;
        }
        return s;
    }
    public static long sumOfDivisors(long n) {
        // code here
        if(n==1) return 1;
        long sum = 0;
        for(int i=1; i<=n; i++){
            sum += divisor(i);
        }
        return sum;
    }
}