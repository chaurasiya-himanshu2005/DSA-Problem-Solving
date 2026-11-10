class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int idx1=-1, idx2=-1;
        int start = 0 , end = n-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<x) start = mid + 1;
            else if(arr[mid]>x) end = mid-1;
            else{
                idx1=mid;
                end = mid-1;
            }
        }
        ans.add(idx1);
        int st=0, endd=n-1;
        while(st<=endd){
            int m = st + (endd-st)/2;
            if(arr[m]<x) st = m+1;
            else if(arr[m]>x) endd = m-1;
            else{
                idx2 = m;
                st = m+1;
            }
        }
        ans.add(idx2);
        return ans;
    }
}
