class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();     
        for(int n : a)
            al.add(n);
            
        for(int n : b)
            al.add(n);
            
        Collections.sort(al);
        return al.get(k-1);
    }
}