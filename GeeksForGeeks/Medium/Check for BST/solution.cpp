/* Structure of a Binary Search Tree node
class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
}; */

class Solution {
  public:
    bool helper(Node* root, Node* min, Node* max){
        if(root == NULL) return true;
        if(min != NULL && root->data <= min->data) return false;
        else if(max != NULL && root->data >= max->data) return false;
        
        return helper(root->left, min, root) && helper(root->right, root, max);
    }
    bool isBST(Node* root) {
        // code here
        return helper(root, NULL, NULL);
    }
};