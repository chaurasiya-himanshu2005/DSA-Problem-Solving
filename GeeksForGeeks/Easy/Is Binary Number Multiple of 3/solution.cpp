// User function template for C++
class Solution {
  public:
    bool isMultipleOf3(string& s) {
        // code here
        int n = s.length();
        int  ans = 0;
      
        for(int i=n-1;i>=0;i--){
            ans= (ans*2 + (s[i]-'0'))%3;
            
        }
        return ans == 0;
    }
};