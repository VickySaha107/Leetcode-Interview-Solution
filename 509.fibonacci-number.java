/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        int x=0;int y=1;
        int i;int sum;
        if(N<=1) return N;
        for(i=2;i<=N;i++){
           sum=x+y;
            x=y;
            y=sum;
        }
        return y; 
    }
}
// @lc code=end

