class Solution {
    int firstIndex(int[] arr, int low, int high, int target){
        int pos = arr.length;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                pos = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return pos;
    }
    
    int lastIndex(int[] arr, int low, int high,int target){
        int pos = arr.length;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] > target){
                pos = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return pos;
    }
    
    int countFreq(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        
        int lowerBound = firstIndex(arr, low, high, target);
        int upperBound = lastIndex(arr, low, high, target);
        
        return upperBound - lowerBound;
    }
}
