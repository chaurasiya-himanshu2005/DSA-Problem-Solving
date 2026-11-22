class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for(int key: arr){
            count += freq.getOrDefault(key - k, 0);
            
            if(k!=0){
                count += freq.getOrDefault(key+k, 0);
            }
            
            freq.put(key, freq.getOrDefault(key, 0)+1);
        }
        return count;
    }
}