class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
       int min = a<b?a:b;
       int gcd = 1;
       for(int i=1; i<=min; i++){
           if(a%i==0 && b%i==0) gcd = i;
       }
       int lcm = (a*b)/gcd;
       return new int[]{lcm, gcd};
    }
}