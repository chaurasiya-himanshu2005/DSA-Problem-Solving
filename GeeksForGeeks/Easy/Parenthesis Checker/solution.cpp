class Solution {
  public:
    bool isBalanced(string& s) {
        // code here
        stack<int> st;
        int n = s.size();
        if(n%2 != 0) return false;
        for(char ch : s){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.size() == 0) return false;
                if((ch == ')' && st.top() == '(') || (ch == '}' && st.top() == '{') ||
                (ch == ']' && st.top() == '[')) st.pop();
                else return false;
            }
        }
        return (st.size() == 0);
    }
};