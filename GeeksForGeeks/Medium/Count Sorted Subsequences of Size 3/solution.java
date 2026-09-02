// User function Template for Java

class Solution {
    public int countTriplets(List<Integer> nums) {
        // code here
        int n = nums.size();
        int count = 0;
        
        for(int i=0; i < n; i++){
            int leftSmaller=0;
            int rightGreater=0;
            
            // left side 
            for(int j=0; j<i; j++){
                if(nums.get(j) < nums.get(i)){
                    leftSmaller++;
                }
            }
            // right side
            for(int k=i+1; k<n; k++){
                if(nums.get(k) > nums.get(i)){
                    rightGreater++;
                }
            }
            count += leftSmaller * rightGreater;
        }
        return count;
    }
}