class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int start = 0, end = stalls[n-1] - stalls[0], ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isPossible(stalls, n,k, mid)){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] stalls, int n, int k, int minAllowedDistance){
        int cow = 1, lastStallsPos = stalls[0];
        for(int i=0; i<n; i++){
            if(stalls[i] - lastStallsPos >= minAllowedDistance){
                cow++;
                lastStallsPos = stalls[i];
            }
            if(cow == k){
                return true;
            }
        }
        return false;
    }
}