class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int n = mat.length; 
        int m = mat[0].length;
        int low = mat[0][0];
        int high = mat[n-1][m-1];
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isFoundSmallest(mat, mid, k) < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    
    private int isFoundSmallest(int[][] mat, int num, int k){
        int row = mat.length-1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < mat[0].length){
            if(mat[row][col] > num)
                row--;
            else{
                count += row + 1;
                col++;
            }
        }
        return count;
    }
}
