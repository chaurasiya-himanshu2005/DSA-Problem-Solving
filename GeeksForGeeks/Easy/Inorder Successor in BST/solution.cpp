/*
Definition for Node
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};
*/

class Solution {
  public:
    int inOrderSuccessor(Node *root, Node *k) {
        // code here
        if(root == NULL) return -1;
        int succ = -1;
        
        while(root != NULL){
            if(root->data > k->data){
                succ = root->data;
                root = root->left;
            }else{
                root = root->right;
            }
        }
        
        return succ;
    }
};