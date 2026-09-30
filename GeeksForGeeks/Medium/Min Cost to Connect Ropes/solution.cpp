class Solution {
  public:
    int minCost(vector<int>& arr) {
        // code here
        int n = arr.size();
        priority_queue<int, vector<int>, greater<int> > pq;
        int mincost = 0;
        
        for(int i = 0; i<n; i++){
            pq.push(arr[i]);
        }
        while(pq.size() > 1){
            int x = pq.top(); pq.pop();
            int y = pq.top(); pq.pop();
            pq.push(x+y);
            mincost += (x+y);
        }
        return mincost;
    }
};