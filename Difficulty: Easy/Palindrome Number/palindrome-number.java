class Solution {
    public boolean isPalindrome(int n) {
        // code here
        n *= (n < 0) ? -1: 1;
        int num = n;
        int rev =0;
        while(n > 0){
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        if( num == rev ) return true;
        return false;
    }
}