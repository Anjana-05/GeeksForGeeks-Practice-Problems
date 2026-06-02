class Solution {
    static int merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> l = new ArrayList<>();
        int cnt = 0;
        int right = mid+1;
        int left = low;
        while(left <= mid && right <= high){
            if(arr[left] > arr[right]){
                cnt += (mid-left+1);
                l.add(arr[right]);
                right++;
            }
            else{
                l.add(arr[left]);
                left++;
            }
        }
        
        while(left <= mid){
            l.add(arr[left]);
            left++;
        }
            
        while(right <= high){
            l.add(arr[right]);
            right++;
        }
        
        for(int i = 0; i < l.size() ; i++){
            arr[low+i] = l.get(i);
        }
        return cnt;
        
    }
    static int mergeSort(int[] arr, int low , int high){
        int cnt = 0;
        if(low>=high) return cnt;
        int mid = (low + high)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr, 0, arr.length-1);
    }
}