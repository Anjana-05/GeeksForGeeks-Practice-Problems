class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length;
        long sum = 0;
        for(int i = 0  ; i < n; i++){
            sum += arr[i];
        }
        n = n + 1;
        long natSum = (n *(n+1))/2;
        return (int)(natSum - sum);
    }
}