// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while(n!=0){
            int d = n%10;
            sum += d*d*d;
            n/=10;
        }
       if(temp == sum) return true;
       else return false;
    }
}