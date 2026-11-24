class Solution {
    public static long pow(long n, int rev){
        long ans = 1;
        
        while(rev > 0){
            if((rev & 1) == 1){
                ans *= n;
            }
            n *= n;
            rev >>= 1;
        }
        return ans;
    }
    public int reverseExponentiation(int n) {
        // code here
        int temp = n; 
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n%10;
            n /= 10;
        }
        
        return (int) pow(temp, rev);
    }
}
