/* Structure of a Binary Search Tree node
class Node {
public:
    int data;
    Node *left, *right;
    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};*/

class Solution {
  public:
    struct Info{
        int min;
        int max;
        int size;
        
        Info(int mn, int mx, int sz){
            min = mn;
            max = mx;
            size = sz;
        }
    };
    Info helper(Node* root){
        if(root == NULL){
            return Info(INT_MAX, INT_MIN, 0);
        }
        
        Info left = helper(root->left);
        Info right = helper(root->right);
        
        if(root->data > left.max && root->data < right.min){
            int currMin = min(root->data, left.min);
            int currMax = max(root->data, right.max);
            int currSize = left.size + right.size + 1;
            
            return Info(currMin, currMax, currSize);
        }
        
        return Info(INT_MIN, INT_MAX, max(left.size, right.size));
    }
    int largestBst(Node *root) {
        // code here
        Info info = helper(root);
        return info.size;
    }
};