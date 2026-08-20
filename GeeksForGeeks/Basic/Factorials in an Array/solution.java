class Solution {
    boolean factorial(int n){
        if(n==0 || n==1) return true;
        int i=2;
        while(n>=2){
            if(n%i!=0) return false;
            n/=i;
            i++;
        }
        return true;
    }
    public List<Integer> factorialNumbers(List<Integer> arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.size(); i++){
            if(factorial(arr.get(i))) ans.add(arr.get(i));
        }
        return ans;
    }
}