class Solution {
    boolean containsDigit(int n, int d){
        if(n==0) return d==0;
        int c=0;
        while(n!=0){
            int ld = n%10;
            if(ld == d) c++;
            n/=10;
        }
        if(c>0) return true;
        return false;
    }
    public List<Integer> findNumbers(int n, int d) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            if(containsDigit(i, d)) ans.add(i);
        }
        return ans;
    }
}