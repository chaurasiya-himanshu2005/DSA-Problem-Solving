class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = ans ^ arr[i];
        }
        for(int i=1; i<=n+1; i++){
            ans = ans ^ i;
        }
        return ans;
    }
}