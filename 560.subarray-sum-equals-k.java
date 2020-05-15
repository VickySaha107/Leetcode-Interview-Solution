/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0) return 0;
        HashMap<Integer,Integer> presum=new HashMap<>();
        int count=0;
        int curr_sum=0;
        presum.put(0,1);
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            if(presum.containsKey(curr_sum-k)){
                count+=presum.get(curr_sum-k);
            }
            presum.put(curr_sum,presum.getOrDefault(curr_sum,0)+1);
        }
        return count;
       //  int count=0;
       //  for(int i=0;i<nums.length;i++){
       //       int curr_sum=0;
       //      for(int j=i;j<nums.length;j++){
       //          curr_sum+=nums[j];
       //          if(curr_sum==k)
       //              count++;
       //      }
       //  }
       //  return count;
    }
}
// @lc code=end

