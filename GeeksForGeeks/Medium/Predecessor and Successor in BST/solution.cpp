class Solution {
public:
    Node* pre = NULL;
    Node* suc = NULL;

    void find(Node* root, int key) {
        if(root == NULL) return;

        if(root->data < key) {
            pre = root;
            find(root->right, key);
        }
        else if(root->data > key) {
            suc = root;
            find(root->left, key);
        }
        else {
            // predecessor
            Node* temp = root->left;
            while(temp) {
                pre = temp;
                temp = temp->right;
            }

            // successor
            temp = root->right;
            while(temp) {
                suc = temp;
                temp = temp->left;
            }
        }
    }

    vector<Node*> findPreSuc(Node* root, int key) {
        find(root, key);
        return {pre, suc};
    }
};