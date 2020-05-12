/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate=0;
        int i;
        for(i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            count++;
         }else{
                if(nums[i]==candidate){
                    count++;
                }
            else{
                count--;
            }
          }
     }//check that the candidates occur more than n/2 times 
        for(i=0;i<nums.length;i++){
            if(nums[i]==candidate)
                count++;
            }
        if(count>nums.length/2)
        return candidate;
        else
            return 0;
     }
}
// int candidate=nums[0], count=0;
//          for(int i=1;i<nums.length;i++){
//            if(candidate==nums[i])
//              count++;
//              else {
//                  count--;
//          } if(count==0){
//                  candidate=nums[i];
//                  count++;
//              }
//          }
//              return candidate;
// @lc code=end

