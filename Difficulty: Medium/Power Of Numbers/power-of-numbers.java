class Solution {
    public int reverse(int n, int rev){
        if(n == 0)
            return rev;
        return reverse(n/10, rev * 10 + n % 10);
    }
    
    public int power(int n , int exp){
        if(exp == 0)
            return 1;
        return n * power(n, exp-1);
    }
    public int reverseExponentiation(int n) {
        // code here
        int pow = reverse(n, 0);
        return power(n, pow);
    }
}
