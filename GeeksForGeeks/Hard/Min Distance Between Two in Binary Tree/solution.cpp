/* A binary tree node
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = nullptr;
        right = nullptr;
    }
};
 */

class Solution {
  public:
    vector<Node*> a1;
       vector<Node*> b2;
       void paths(Node* root, vector<Node*>& arr, int p, int q){
          if(root == NULL) return;
          arr.push_back(root);
          if(root->data == p) a1 = arr; // a me arr ki copy gyi hai
          if(root->data == q) b2 = arr; // b. me arr ki copy gyi hai
          paths(root->left, arr,p, q);
          paths(root->right, arr, p, q);
          arr.pop_back();
       }
    int findDist(Node* root, int a, int b) {
        // code here
        a1.resize(0);
        b2.resize(0);
        vector<Node*> arr;
        paths(root,arr, a, b);
        int i = 0, j = 0;
        while(i< a1.size() && j < b2.size()){
            if(a1[i]->data == b2[j]->data){
                i++;
                j++;
            }else break;
        }
        return a1.size() - i + b2.size() - j;
    }
};