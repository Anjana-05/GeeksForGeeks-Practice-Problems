class Solution {
    int thirdLargest(int arr[]) {
        // code here
        if(arr.length < 3) return -1;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(firstLargest <= arr[i]){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(secondLargest <= arr[i]){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if(thirdLargest < arr[i]){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
}