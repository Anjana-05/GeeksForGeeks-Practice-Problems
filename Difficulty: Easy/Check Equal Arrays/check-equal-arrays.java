class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        if(a.length != b.length) return false;
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int n : a){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        
        for(int n: b){
            hm.put(n, hm.getOrDefault(n,0)-1);
        }
        
        for(int n: hm.values()){
            if(n > 0)
                return false;
        }
        
        
        return true;
    }
}