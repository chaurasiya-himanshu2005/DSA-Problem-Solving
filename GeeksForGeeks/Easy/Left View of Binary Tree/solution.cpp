/* Structure of Binary Tree Node
class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};*/

class Solution {
  public:
    void dfs(Node* root, int lvl, vector<int>& ans){
        if(root == NULL) return;
        if(ans[lvl] == -1) ans[lvl] = root->data;
        dfs(root->left,lvl+1,ans);
        dfs(root->right,lvl+1, ans);
    }
    int levels(Node* root){
        if(root == 0) return 0;
        return 1 + max(levels(root->left),levels(root->right));
    }
    vector<int> leftView(Node *root) {
        // code here
        int n = levels(root);
        vector<int> ans(n, -1);
        dfs(root, 0, ans);
        return ans;
    }
};