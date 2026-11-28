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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currSum = 0 ;
        flag = false;
        has(root,targetSum,currSum);
        return flag;
    }
    public void has(TreeNode root , int tS,int currSum){
        if(flag || root == null) return;
        currSum += root.val;
        if(root.left == null && root.right == null){
            if(currSum == tS){
                flag = true;
                
            }
            return;

        }
        has(root.left,tS,currSum);
        has(root.right,tS,currSum);

    }
}