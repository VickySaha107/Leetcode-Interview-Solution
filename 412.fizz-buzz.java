/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans =new ArrayList<>(); 
       for ( int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0){
                ans.add("FizzBuzz");
            } else if(i%3==0){
                ans.add("Fizz");
            }else if(i%5==0){
                ans.add("Buzz");
            }else{ 
                ans.add(String.valueOf(i));
        }
    }
  
        return ans; 
    }
}
// @lc code=end

