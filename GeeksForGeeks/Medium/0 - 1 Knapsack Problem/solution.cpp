
class Solution {
  public:
    int maxLoot(int c, int idx, vector<int> &val,
                vector<int> &wt, vector<vector<int>>& dp) {

        if(idx < 0) return 0;

        if(dp[idx][c] != -1) return dp[idx][c];

        int skip = maxLoot(c, idx-1, val, wt, dp);

        int pick = 0;

        if(c - wt[idx] >= 0) {
            pick = val[idx] + maxLoot(c-wt[idx], idx-1, val, wt, dp);
        }

        return dp[idx][c] = max(pick, skip);
    }

    int knapsack(int W, vector<int> &val, vector<int> &wt) {
        int n = wt.size();

        vector<vector<int>> dp(n, vector<int>(W+1, -1));

        return maxLoot(W, n-1, val, wt, dp);
    }
};
