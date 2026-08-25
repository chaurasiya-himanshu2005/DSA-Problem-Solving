class Solution {
  public:
    pair<int, int> countOddEven(vector<int> &arr) {
        // code here
        int countOdd = 0, countEven = 0;
        int n = arr.size();
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
       return {countOdd, countEven};
    }
};