import sys
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        dp={}
        cur_length=0
        i=0
        min_length= -sys.maxsize-1
        if(len(s)<=1): return len(s)
        while (i<len(s)):
            if(s[i] not in dp.keys()):
                dp[s[i]]=i
                cur_length+=1
                min_length=max(cur_length,min_length)
                i+=1
            elif(s[i] in dp.keys()):
                #print(dp)
                #print(min_length)
                min_length=max(cur_length,min_length)
                i=dp[s[i]]+1
                dp={}
                cur_length=0
            
        if(min_length==-sys.maxsize-1):
            min_length=cur_length
        return(min_length)
            
            