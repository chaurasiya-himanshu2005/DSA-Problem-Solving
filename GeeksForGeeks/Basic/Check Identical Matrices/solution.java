// User function Template for Java

class Solution {
    boolean identicalMat(int[][] Grid1, int[][] Grid2) {
        // code here
        int N = Grid1.length;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(Grid1[i][j]!=Grid2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}