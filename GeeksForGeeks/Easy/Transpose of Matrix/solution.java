class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<col; i++){
            res.add(new ArrayList<>());
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                res.get(j).add(mat[i][j]);
            }
        }
        return res;
    }
}