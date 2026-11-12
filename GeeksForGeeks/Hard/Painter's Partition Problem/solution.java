class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length;
        int max = arr[0], sum = 0, ans = -1;
        for(int i =0; i<n ; i++){
            if(arr[i]>max) max = arr[i];
            sum += arr[i];
        }
        int start = max, end = sum;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isPossible(arr, n, k, mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int[] arr, int n, int k, int minAllowedTime){
        int painter = 1, time = 0;
        for(int i=0; i<n; i++){
            if(arr[i] + time <= minAllowedTime){
                time += arr[i];
            }else{
                painter++;
                time = arr[i];
            }
        }
        return painter<=k;
    }
}
