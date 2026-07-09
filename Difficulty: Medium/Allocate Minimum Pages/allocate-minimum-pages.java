class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        long ans = -1;
        long low = Integer.MIN_VALUE;
        long high = 0;
        for(int n : arr){
            low = Math.max(low, n);
            high += n;
        }
        
        while(low <= high){
            long mid = low +(high-low)/2;
            
            if(canAssign(arr, mid, k)){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return (int)ans;
    }
    
    
    private boolean canAssign(int[] arr, long limit, int k){
        int count = 1;
        long sum = 0;
        
        for(int n : arr){
            if((sum + n) > limit){
                count++;
                sum = 0;
            }
            sum += n;
        }
        
        return count <= k;
    }
}