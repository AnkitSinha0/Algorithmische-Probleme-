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
    private  boolean balanced;
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        check(root);
        return balanced;
    }

    public int check(TreeNode root){
        
        if(root ==  null || !(balanced)) return 0;
        int left = check(root.left);
        int right = check(root.right);

        if((Math.abs(left - right) > 1)){
            balanced = false;
        }

        return Math.max(left,right) + 1; 

    }
}