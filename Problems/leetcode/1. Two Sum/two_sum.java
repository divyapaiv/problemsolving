/* TC- O(N)
SC - O(N) */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[]= new int[2];
        int index=0;
        for(index=0;index<nums.length;index++){
            
                if(map.containsKey(target-nums[index]) && (target-nums[index]!=nums[index] ||
                   map.get(Math.abs(target-nums[index]))!=index))
                {
                    
                   a[0]= map.get(target-nums[index]);
                   a[1]= index;
                   
                   return(a);
                      
                }
                else{
                    map.put(nums[index],index);
                }
         
        }
        return null;
    }
        
    }