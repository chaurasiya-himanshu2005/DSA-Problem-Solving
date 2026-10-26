class Solution {
  public:
    double fractionalKnapsack(vector<int>& val, vector<int>& wt, int capacity) {
        int n = val.size();
        vector<pair<double,int>> v;
        
        for(int i=0;i<n;i++){
            v.push_back({(double)val[i]/wt[i] , i});
        }
        
        sort(v.rbegin() , v.rend());
        
        double ans = 0.0;
        
        for(auto n : v){
            int i = n.second;
            
            if(wt[i] <= capacity){
                ans += val[i];
                capacity -= wt[i];
            }
            
            else{
                ans += (double)val[i] * capacity / wt[i];
                break;
            }
            
        }
        return ans;
        
    }
};
