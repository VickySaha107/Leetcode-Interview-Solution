/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // return nums.length*(nums.length+1)/2-sum;
        // HashSet<Integer> HT=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // HT.add(nums[i]);
        // int HTlen=nums.length+1;
        // for(int i=0;i<HTlen;i++){
        //     if(!HT.contains(i))
        //         return i;
        // }
        // return -1;
        int miss_val=nums.length;
        for(int i=0;i<nums.length;i++){
            miss_val^=i^nums[i];
        }
        return miss_val; 
    }
}
// @lc code=end

