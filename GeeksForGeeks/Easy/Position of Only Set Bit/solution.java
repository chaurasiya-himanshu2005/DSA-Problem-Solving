class Solution {
    public int findPosition(int n) {
        // code here
        int count = 0;
        int position = 0;
        while(n>0){
            if((n&1) == 1){
            count++;
            }
            position++;
            n = n>>1;
        }
        if(count == 1) return position;
        return -1;
    }
}