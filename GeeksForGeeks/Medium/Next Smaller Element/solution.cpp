class Solution {
  public:
    vector<int> nextSmallerEle(vector<int>& arr) {
        //  code here
        stack<int> s;
        int n = arr.size();
        vector<int> ans(n);
        ans[n-1] = -1;
        s.push(arr[n-1]);

        for(int i = n - 2; i>= 0; i--){
            while(s.size() > 0 && s.top() >= arr[i]) s.pop();
            if(s.size() == 0) ans[i] = -1;
            else ans[i] = s.top();
            s.push(arr[i]);
        }
        return ans;
    }
};