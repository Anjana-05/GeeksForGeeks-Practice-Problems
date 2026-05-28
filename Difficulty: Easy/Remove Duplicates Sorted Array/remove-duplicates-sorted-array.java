class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : arr)
            hs.add(n);
        ArrayList<Integer> res = new ArrayList<>(hs);   
        Collections.sort(res);
        return res;
    }
}
