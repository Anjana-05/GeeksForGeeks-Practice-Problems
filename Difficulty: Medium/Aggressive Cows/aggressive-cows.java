class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low = 1, high = arr[arr.length-1] - arr[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(canTie(arr,k,mid)){
                ans = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }
    
    private boolean canTie(int[] arr, int k , int gap){
        int cows = 1;
        int lastIndex = arr[0];
        for(int i = 1; i < arr.length; i++){
            if((arr[i] - lastIndex) >= gap){
                cows++;
                lastIndex = arr[i];
            }
        }
        return cows >= k;
    }
}