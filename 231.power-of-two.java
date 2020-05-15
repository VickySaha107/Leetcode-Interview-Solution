/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) 
          return false;
    //     long i;
    // for( i=1;i<n;i=i*2){
    //     if(i==n)
    //         break;
    // }
    //     return i==n;
        // long i=1;
        // while(i<n){
        //     i*=2;
        // }
        // return i==n;
        return (Math.log10(n)/Math.log10(2))%1==0;
    }
}
// @lc code=end

