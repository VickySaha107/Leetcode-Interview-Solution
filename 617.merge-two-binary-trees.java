/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return t2;
        } 
         if(t2==null){
             return t1;
         }
         t1.val=t1.val+t2.val;//for root node
        t1.left =mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t1.right,t2.right);
         return t1;
    }
}
// @lc code=end

