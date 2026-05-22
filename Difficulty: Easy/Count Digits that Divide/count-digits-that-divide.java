// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem != 0 && num % rem == 0)
                count++;
            n = n / 10;
        }
        return count;
    }
}