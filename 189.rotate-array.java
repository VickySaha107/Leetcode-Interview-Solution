/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        k=k%nums.length;
        reversearray(nums,0,nums.length-1);
        reversearray(nums,0,k-1);
        reversearray(nums,k,nums.length-1);
    }
        public void reversearray(int[]nums,int start,int end){
            while(start<end){
                int temp;
                temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
              }  
    }
}
// @lc code=end

