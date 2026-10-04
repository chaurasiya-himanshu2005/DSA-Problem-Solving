class Solution {
    boolean areSet(int n) {

        if ((n & 1) == 0) {
            return false;
        }

        int x = n - 1;

        if ((x & (x - 1)) == 0) {
            return true;
        }

        return false;
    }
}