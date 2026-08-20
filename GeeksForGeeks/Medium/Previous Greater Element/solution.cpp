class Solution {
  public:
    vector<int> preGreaterEle(vector<int>& arr) {
        //  code here
         int n = arr.size();
        stack<int> s;
        vector<int> ans(n);
        ans[0] = -1;
        s.push(arr[0]);
        for(int i = 1; i<n; i++){
            while(s.size()>0 && s.top() <= arr[i]) s.pop();
            if(s.size() == 0) ans[i] = -1;
            else ans[i] = s.top();
            s.push(arr[i]);
        }
       return ans;
    }
};