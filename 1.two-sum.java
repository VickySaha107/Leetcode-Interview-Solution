/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check=target-nums[i];
            if(hm.containsKey(check)){
                return new int[]{hm.get(check),i};
            }
             hm.put(nums[i], i);
        }
           throw new IllegalArgumentException("no match found");
    }
}
// Brute Force approach
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int check=target-nums[i];
//                 if(nums[j]==check){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//            throw new IllegalArgumentException("no match found");
//     }
// }
// @lc code=end

