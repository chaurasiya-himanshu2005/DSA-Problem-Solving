class Solution {
    static int reverse(int n){
        int rev = 0;
        while(n !=0){
            rev = rev * 10 + n%10;
            n/=10;
        }
        return rev;
    }
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0; i<arr.length; i++){
            if(arr[i] == reverse(arr[i])) continue;
            else return false;
        }
        return true;
    }
}