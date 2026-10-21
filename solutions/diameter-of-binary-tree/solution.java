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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] max = {0};
        diaTree(root,max);

        return max[0];
    }

    public int diaTree(TreeNode root, int [] max){
        if(root == null){
            return 0;
        }
        int l = diaTree(root.left,max);
        int r =  diaTree(root.right,max);
        
        if(l == 0 && r ==0){
        return 1;
        }
        max[0] = Math.max(max[0],l+r);

        return (Math.max(l,r)+1);        
    }
}