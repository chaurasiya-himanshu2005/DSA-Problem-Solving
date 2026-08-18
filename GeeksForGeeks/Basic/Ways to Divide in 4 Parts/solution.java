// User function Template for Java

class Solution {
    static long countWays(int N) {
        // code here
        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=j; k++){
                    for(int l=1; l<=k; l++){
                        if(i+j+k+l == N){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}