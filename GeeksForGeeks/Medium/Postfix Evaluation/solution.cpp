class Solution {
  public:
    int evaluatePostfix(vector<string>& arr) {
        // code here
        stack<int> st;
        
        for(string s : arr){
            
            if(isdigit(s[0]) || s[0] == '-' && s.size() > 1) {
                st.push(stoi(s));
            }
            else{
                int b = st.top();
                st.pop();
                int a = st.top();
                st.pop();
                
                if(s == "+") st.push(a + b);
                
                else if(s == "-") st.push(a - b);
                
                else if(s == "*") st.push(a * b);
                
                else if(s == "/") st.push(floor((double)a/b));
            
                else if(s == "^") st.push(pow(a, b));
            }
        }
        return st.top();
    }
};