class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
     map<int,int> cache ; 
     vector<int> output;
     int B=0;
        for(int i=0;i<nums.size();i++){
            B=target-nums[i]; 
            if(cache.count(B)>0 and (B!=nums[i] or cache[B]!=i)){
                output.push_back(i);
                output.push_back(cache[B]);
                return output;
            }
            else
            {
                cache[nums[i]]=i;
            }
        }
         return output;
        
    }
};