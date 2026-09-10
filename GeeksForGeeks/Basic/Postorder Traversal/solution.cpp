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
    void dfs(Node* root, vector<int>& ans){
        if(root == NULL) return;
        dfs(root->left, ans);
        dfs(root->right,ans);
        ans.push_back(root->data);
    }
    vector<int> postOrder(Node* root) {
        // code here
        vector<int> ans;
        dfs(root, ans);
        return ans;
    }
};