class Solution {
  public:
    int priority(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return 0;
    }
    string infixToPostfix(string& s) {
        // code here
        stack<char> st;
        string ans = "";
        
        for(int i = 0; i<s.size(); i++){
            char ch = s[i];
            
            if(isalnum(ch)){
                ans += ch;
            }
              // Opening bracket
            else if(ch == '('){
                  st.push(ch);
              }
              // closing bracket
             else if(ch == ')'){
                  
                  while(!st.empty() && st.top() != '('){
                      ans += st.top();
                      st.pop();
                  }
                  
                  st.pop(); // 'remove ('
              }
              
              // Operator
              else{
                 while(!st.empty() && 
                       st.top() != '(' && 
                       (priority(st.top()) > priority(ch) ||
                        (priority(st.top()) == priority(ch) && ch != '^'))){
                            
                            ans += st.top();
                            st.pop();
                    }
                    st.push(ch);
              }
        }
        // empty the stack 
        while(!st.empty()){
            ans += st.top();
            st.pop();
        }
        return ans;
    }
};
