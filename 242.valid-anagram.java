/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length()!= t.length()){
            return false; 
         }
           int[] HT =new int[26];
         for(int i=0;i<s.length();i++){
            HT[s.charAt(i) - 97]++; 
         }
         for(int i=0;i<t.length();i++){
             HT[t.charAt(i) - 97]--;
             if(HT[t.charAt(i) - 97]<0)
                 return false;
         }
         return true;
    }
}
// @lc code=end

