class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;
        
        for(int i = 0; i<arr.length; i++){
            
            sum += arr[i];
            
            if(sum == 0){
                maxLength = i + 1;
            }
            
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                
                maxLength = Math.max(maxLength, len);
            }
            else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}