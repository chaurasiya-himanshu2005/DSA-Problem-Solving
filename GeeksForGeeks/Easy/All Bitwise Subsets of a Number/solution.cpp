
// fucntion to find bitwise subsets
// Efficient approach
class Solution {
  public:
    vector<int> printSubsets(int n) {
        // Code here
         vector<int>ans;
        for(int i=n;i>=0;i--){
            if((i&n)==i){
                ans.push_back(i);
            }
        }
        return ans;
        
    }
};
