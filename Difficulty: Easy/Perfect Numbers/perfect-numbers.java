class Solution {
    static boolean isPerfect(int n) {
        // code here
        int num = n;
        int sum = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                sum += i;
                if(i != n/i && n/i != n)
                    sum += n/i;
            }
        }
        if(sum == num) return true;
        return false;
    }
};