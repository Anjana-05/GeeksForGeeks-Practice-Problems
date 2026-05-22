class Solution {
    public int getLastDigit(String a, String b) {
        int n1 = a.charAt(a.length()-1)-'0';
        
        int[][] cycles = {
            {0},
            {1},
            {2,4,8,6},    
            {3,9,7,1},    
            {4,6},        
            {5},          
            {6},          
            {7,9,3,1},    
            {8,4,2,6},    
            {9,1}         
        };
        
        int[] cycle = cycles[n1];
        if(cycle.length == 1)
            return cycle[0];
            
        int cycleLength = cycle.length;
            
        int mod = 0;
        for(int i = 0 ; i < b.length() ; i++){
            mod = (mod * 10 + (b.charAt(i) - '0')) % cycleLength;
        }
        
        if(mod == 0)
            mod = cycleLength;
        
        return cycle[mod-1];
    }
};