class Solution {
    public int[] sieve(int n) {
        // code here
        int[] preCompute = new int[n+1];
        Arrays.fill(preCompute,1);
        int size = 0;
        
        for(int i = 2 ; i <= n; i++){
            if(preCompute[i] == 1){
                for(int j = i*i ; j <= n ; j+=i){
                    preCompute[j] = 0;
                }
            size++;
            }
        }
        int[] res = new int[size];
        int index = 0;
        for(int i = 2 ; i <= n ; i++){
            if(preCompute[i] == 1)
                res[index++] = i;
        }
        return res;
    }
}