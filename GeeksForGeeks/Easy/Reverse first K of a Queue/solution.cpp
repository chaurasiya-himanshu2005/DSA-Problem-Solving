class Solution {
  public:
    queue<int> reverseFirstK(queue<int> q, int k) {
        // code here
        stack<int> s;
        int n = q.size();
        if(k > n){
            return q;
        }
        for(int i = 1; i<=k; i++){
            s.push(q.front());
            q.pop();
        }
        while(s.size() > 0 ) {
            q.push(s.top());
            s.pop();
        }
        for(int i = 1; i<= n-k; i++){
            q.push(q.front());
            q.pop();
        }
        
        return q;
    }
};