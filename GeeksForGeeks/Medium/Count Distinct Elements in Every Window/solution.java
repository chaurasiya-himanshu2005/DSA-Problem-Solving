class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        
        //first window
        for(int i = 0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        // store in distinct element
        ans.add(map.size());
        
        //next window
        for(int i=k; i<n; i++){
            // remove left element
            int left = arr[i-k];
            map.put(left, map.get(left)-1);
            
            if(map.get(left) == 0){
                map.remove(left);
            }
            // add right element
            int right = arr[i];
            map.put(right, map.getOrDefault(right, 0)+1);
            
            //store in distinct element
            ans.add(map.size());
        }
        return ans;
    }
}