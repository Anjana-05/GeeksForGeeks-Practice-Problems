class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        for(int i = 0; i < arr.length ; i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j = i+1; j < arr.length; j++){
                int sum = -(arr[i]+arr[j]);
                
                if(hs.contains(sum))
                    return true;
                hs.add(arr[j]);
            }
        }
        return false;
    }
}