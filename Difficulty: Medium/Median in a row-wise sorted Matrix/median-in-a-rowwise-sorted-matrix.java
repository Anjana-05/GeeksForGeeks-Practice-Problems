class Solution {
    public int median(int[][] mat) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                res.add(mat[i][j]);
            }
        }
        
        Collections.sort(res);
        
        return res.get(res.size()/2);
    }
}