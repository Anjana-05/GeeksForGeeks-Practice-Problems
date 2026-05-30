class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int msum = Integer.MIN_VALUE, csum = 0;
        for(int n : arr){
            csum += n;
            msum = (msum < csum) ? csum : msum;
            if(csum < 0) csum = 0;
        }
        return msum;
    }
}
