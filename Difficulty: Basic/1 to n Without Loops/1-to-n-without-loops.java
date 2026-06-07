class Solution {
    public void printTillN(int n) {
        // code here
        if(n > 1)
            printTillN(n-1);
        
        System.out.print(n+" ");
    }
}