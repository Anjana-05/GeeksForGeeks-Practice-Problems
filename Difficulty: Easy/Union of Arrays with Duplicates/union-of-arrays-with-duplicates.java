class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int n : a)
            hs.add(n);
        
        for(int n : b)
            hs.add(n);
        ArrayList<Integer> res = new ArrayList<>(hs);
        Collections.sort(res);
        return res;
    }
}