class Solution {
    int minRow(int mat[][]) {
        // code here
        int minSum = Integer.MAX_VALUE;
        int row = 0;
        for(int i = 0 ; i < mat.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            if(minSum > sum){
                minSum = sum;
                row = i+1;
            }
        }
        return row;
    }
};