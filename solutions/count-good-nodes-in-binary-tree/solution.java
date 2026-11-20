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
    
    int goodOnes;
    public int goodNodes(TreeNode root) {
        goodOnes = 0;
        TreeNode prev = null;
        goodDih(root,prev);
        return goodOnes;
    }
    public void goodDih(TreeNode root,TreeNode prev){
        if(root == null) return;
        if(prev == null || root.val >= prev.val){
            goodOnes++;
        goodDih(root.left,root);
        goodDih(root.right,root);
        }else{
             goodDih(root.left,prev);
        goodDih(root.right,prev);
        }
       
        return;
        
        
    }
}