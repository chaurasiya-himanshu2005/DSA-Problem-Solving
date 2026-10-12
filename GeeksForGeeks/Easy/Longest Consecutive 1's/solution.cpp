class Solution {
  public:
    int maxConsecutiveOnes(int n) {
        // code here
       int ans =0;
       int count =0;
       while(n>0){
         
           if((n&1)==1){
               count++;
               ans = ans>count?ans:count;
           }else{
               count=0;
                
           }
           n = n>>1;
       }
       
       return ans;
    }
};
