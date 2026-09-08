class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int result = 0;
        for(int i=0; i<k; i++){
            result += arr[i];
        }
        int currSum = result;
        for(int i=k; i<n; i++){
            currSum += arr[i] - arr[i-k];
            
            result = Math.max(result, currSum);
        }
        return result;
    }
}