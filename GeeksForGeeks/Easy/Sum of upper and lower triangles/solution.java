
class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        
        int sumUpper = 0;
        int sumLower = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i<=j) {
                    sumUpper += mat[i][j];
                }if(i>=j){
                    sumLower += mat[i][j];
                }
            }
        }
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(sumUpper);
        sum.add(sumLower);
        return sum;
    }
}