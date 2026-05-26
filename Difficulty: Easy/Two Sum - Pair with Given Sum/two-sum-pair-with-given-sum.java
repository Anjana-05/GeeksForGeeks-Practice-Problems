class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : arr){
            if(hs.contains(target-n))
                return true;
            hs.add(n);
        }
        
        return false;
    }
}