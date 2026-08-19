// User function Template for Java
class Solution {
    static ArrayList<Integer> pronicNumbers(int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i*(i+1)<=N; i++){
            ans.add(i*(i+1));
        }
        return ans;
    }
}