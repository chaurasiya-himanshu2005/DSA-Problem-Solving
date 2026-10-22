class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int ans = 0;
        
        int[] freq = new int[k];
        
        for(int num : arr){
            int rem = num % k;
            int need = (k - rem) % k;
            ans += freq[need];
            freq[rem]++;
        }
        return ans;
    }
}