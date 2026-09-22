class Solution {
  public:
    vector<int> findTwoElement(vector<int>& arr) {
        // code here
        int n = arr.size();
        sort(arr.begin(), arr.end());
        
        long long totalsum = 1LL * n * (n+1)/2;
        
        int repeat = -1, sum = arr[0];
        for(int i = 1; i<n; i++){
            sum += arr[i];
            if(arr[i] == arr[i-1]){
                repeat = arr[i];
            }
        }
        sum = sum - repeat;
        long long missing = (totalsum - sum);
        
        return {repeat, (int)missing};
    }
};