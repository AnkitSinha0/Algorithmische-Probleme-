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
    public int maxDepth(TreeNode root) {
        int h = 0;
        return depthTree(root,h);
    }

    public int depthTree(TreeNode root, int h){
        if(root == null){
            return h; 
        }
        return Math.max(depthTree(root.left,h+1) , depthTree(root.right,h+1));
    } 
}