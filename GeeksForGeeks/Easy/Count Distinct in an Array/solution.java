// User function Template for Java
import java.util.HashSet;
class Solution {
    static int countDistinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int ele : arr) set.add(ele);
        return set.size();
    }
}