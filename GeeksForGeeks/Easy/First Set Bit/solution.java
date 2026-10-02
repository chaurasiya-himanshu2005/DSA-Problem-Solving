class Solution {
    public static int getFirstSetBit(int n) {
        // code here
        int c = 1;
        while(n>0){
            if((n&1)==1) {
        
            return c;
                
            }
            c++;
            
            n = n >> 1;
        }
       return -1;
        
    }
}