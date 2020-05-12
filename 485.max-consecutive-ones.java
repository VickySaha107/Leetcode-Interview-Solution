/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Max_1=0;
        int curr_num_1=0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]==1){
           curr_num_1+=1;
             Max_1=Math.max(Max_1,curr_num_1);
         }else{
           curr_num_1=0;  
         }
     }
     return Max_1; 
    }
}
// @lc code=end

