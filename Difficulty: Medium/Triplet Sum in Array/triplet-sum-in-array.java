class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        for(int i = 0 ; i < arr.length ; i++){
            HashSet<Integer> hs = new HashSet<>();
            
            for(int j = i+1 ; j < arr.length; j++){
                if(hs.contains(target -arr[i]-arr[j]))
                    return true;
                    
                hs.add(arr[j]);
            } 
        }
        return false;
    }
}
