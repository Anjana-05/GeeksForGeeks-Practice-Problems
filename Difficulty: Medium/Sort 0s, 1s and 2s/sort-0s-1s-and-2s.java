class Solution {
    public void sort012(int[] arr) {
        // code here
        int numZeros = 0, numOnes = 0, numTwos = 0;
        for(int num : arr){
            if(num == 0)
                numZeros++;
            else if(num == 1)
                numOnes++;
            else
                numTwos++;
        }
        int i = 0;
        
        while(numZeros-- > 0){
            arr[i++] = 0;
        }
        
        while(numOnes-- > 0){
            arr[i++] = 1;
        }
        
        while(numTwos-- > 0){
            arr[i++] = 2;
        }
    }
}