class Solution {
    
    int check(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public boolean isBleak(int n) {
        // Code here
        for(int i=Math.max(1,n-32); i<n; i++){
            if(i + check(i)==n){
                return false;
            }
        }
        return true;
    }
}