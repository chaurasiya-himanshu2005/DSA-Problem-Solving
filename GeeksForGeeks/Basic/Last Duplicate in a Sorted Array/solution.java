// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int n=arr.length; 
        int lastIndex = -1;
        int value = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    lastIndex = j;
                    value = arr[j];
                }
            }
        }
        return new int[]{lastIndex, value};
    }
}
