/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int check=target-nums[i];
                if(nums[j]==check){
                    return new int[]{i,j};
                }
            }
        }
           throw new IllegalArgumentException("no match found");
    }
}
// @lc code=end

