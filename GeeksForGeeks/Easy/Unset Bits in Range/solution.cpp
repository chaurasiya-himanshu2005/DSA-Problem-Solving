

class Solution {
  public:
    int countUnsetBits(int n, int l, int r) {
        // code here
        int count = 0;
        for(int i=l; i<=r; i++){
            if((n&(1<<(i-1)))==0) count++;
        }
        return count;
    }
};