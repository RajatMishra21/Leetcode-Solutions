class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int m=matrix.length;
         int n = matrix[0].length;
        int j=n-1;
        while(i>=0&&i<m&&j>=0&&j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target)
                i++;
            else if(matrix[i][j]>target)
                j--;
        }
        return false;
    }
}