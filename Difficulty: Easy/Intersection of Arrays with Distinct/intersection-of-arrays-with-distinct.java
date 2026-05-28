class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> ahs = new HashSet<>();
        int cnt= 0;
        for(int n : a)
            ahs.add(n);
        
        for(int n : b){
            if(ahs.contains(n))
                cnt++;
        }
        return cnt;
    }
}