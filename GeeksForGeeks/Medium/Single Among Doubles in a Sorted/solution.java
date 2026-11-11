class Solution {
    int single(int[] arr) {
        // code here
        int n = arr.length; 
        if(n == 1) return arr[0];
        if(arr[0]!= arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int start = 0, end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!= arr[mid+1]) return arr[mid];
            int firstRepeated = mid, secondRepeated = mid;
            if(arr[mid-1] == arr[mid]) firstRepeated = mid - 1;
            else secondRepeated = mid + 1;
            int leftCount = firstRepeated - start;
            int RightCount = end - secondRepeated;
            if(leftCount%2==0) start = secondRepeated + 1;
            else end = firstRepeated - 1;
        }
        return 1;
    }
}