class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int num = n, pow = 0;
        while(n > 0){
            int rem = n % 10;
            pow = (pow * 10) + rem;
            n = n / 10;
        }
        
        return (int)(Math.pow(num,pow));
    }
}
