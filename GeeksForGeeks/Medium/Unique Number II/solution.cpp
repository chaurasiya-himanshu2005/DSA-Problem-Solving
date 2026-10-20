class Solution {
  public:
    vector<int> singleNum(vector<int>& arr) {
        // Code here.
        int n = arr.size();
       
        int xr = 0;
        for(int i=0;i<n;i++){
            xr^=arr[i];
        }
        int rsb = xr&(-xr);
        int left = 0;
        int right = 0;
        for(int i=0;i<n;i++){
            if(arr[i]&rsb){//to check rsb set or not
               left^=arr[i];
            }else{
               right^=arr[i];
            }
        }
        if(left>right){
            swap(left,right);
        }
        return{left,right};
    }
};