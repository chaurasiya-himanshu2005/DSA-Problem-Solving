// User function Template for C++

class Solution {
  public:
    int getSingle(vector<int> &arr) {
        // code here
        int n = arr.size();
        int unq = 0;
        for(int i=0; i<32; i++){
            int c = 0;
            for(int j=0; j<n; j++){
                if((arr[j] & (1<<i)) != 0){
                    c++;
                }
            }
            if(c%3!=0){
                unq = unq | (1<<i);
            }
        }
        return unq;
    }
};