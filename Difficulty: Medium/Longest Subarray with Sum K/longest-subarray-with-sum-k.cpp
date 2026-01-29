class Solution {
  public:
    int longestSubarray(vector<int>& arr, int k) {
        // code here
        int prefixSum =0, maxlength=0, remove =0;
        unordered_map<int, int> mp;
        
        for(int i = 0 ; i < arr.size(); i++){
            prefixSum += arr[i];
            if(prefixSum == k){
                maxlength = max(maxlength , i+1);
            }
            int rem = prefixSum - k;
            if(mp.find(rem) != mp.end()){
                int length = i - mp[rem];
                maxlength = max(maxlength ,length);
            }
            if(mp.find(prefixSum) == mp.end())
                mp[prefixSum] = i;
        }
        return maxlength;
    }
};