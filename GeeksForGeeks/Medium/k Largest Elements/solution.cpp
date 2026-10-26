class Solution {
  public:
    vector<int> kLargest(vector<int>& arr, int k) {
        // code here
        priority_queue<int, vector<int>, greater<int>> pq;
        for(int ele : arr){
            pq.push(ele);
            if(pq.size() > k) pq.pop();
        }
        vector<int> ans;
        while(pq.size() > 0){
            ans.push_back(pq.top());
            pq.pop();
        }
        
        sort(ans.begin(), ans.end());
        reverse(ans.begin(), ans.end());
        return ans;
    }
};