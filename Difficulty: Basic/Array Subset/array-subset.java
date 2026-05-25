
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int n : a){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        
        for(int n : b){
            if(hm.getOrDefault(n,0) <= 0)
                return false;
            else
                hm.put(n,hm.getOrDefault(n,0)-1);
        }
        
        return true;
    }
}
