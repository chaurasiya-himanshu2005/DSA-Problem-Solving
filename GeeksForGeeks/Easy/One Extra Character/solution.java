// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        int n1 = s1.length();
        int n2 = s2.length();
        char ans = 0;
        for(int i = 0; i<n1; i++){
            ans ^= s1.charAt(i);
        } 
        for(int i = 0; i<n2; i++){
            ans ^= s2.charAt(i);
        }
        return ans;
    }
}
