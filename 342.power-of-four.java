/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0) 
          return false;
    //     long i;
    // for( i=1;i<num;i=i*4){
    //     if(i==num)
    //         break;
    // }
    //     return i==num;
        // long i=1;
        // while(i<num){
        //     i*=4;
        // }
        // return i==num;
        return (Math.log10(num)/Math.log10(4))%1==0;
    }
}
// @lc code=end

