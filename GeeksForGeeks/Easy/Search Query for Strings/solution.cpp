/* structure of trie node
struct TrieNode {
    TrieNode *children[26];
    bool isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = nullptr;
        }
    }
};
Note: The following functions are already implemented in the driver code.
You need to only call them, implementation is not required.

1. void insert(TrieNode* root, const string& word);
2. bool search(TrieNode* root, const string& word);
*/

class Solution {
  public:
    vector<int> checkQueries(TrieNode* root, vector<string>& arr,
                             vector<string>& queries) {
        // code here
        
        for(string word : arr){
            insert(root, word);
        }
        
        vector<int> ans;
        
        for(string word : queries){
            ans.push_back(search(root, word) ? 1 : 0);
        }
        
        return ans;
    }
};