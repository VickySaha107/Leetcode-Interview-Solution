/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        public boolean isHappy(int n) {
            if(n==1||n==7){
                return true;
            }else if(n<10){
                return false;
            }
            int sum=0;
            while(n>0){
            sum+=(n%10)*(n%10);//"n%10 indicate one's position
            n/=10;
        }
        return isHappy(sum); 
    }
}
// @lc code=end

