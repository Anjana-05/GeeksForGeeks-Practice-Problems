// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int sum = 0;
        while(n > 0){
            sum += Math.pow((n % 10), 3);
            n /= 10;
        }
        if(sum == num) return true;
        return false;
    }
}