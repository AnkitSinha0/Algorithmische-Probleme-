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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return preOrder(root, subRoot);
    }
    public boolean preOrder(TreeNode root,TreeNode subRoot){
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
             if(sameTree(root,subRoot)){
                return true;
             };       
        }
        boolean l = preOrder(root.left,subRoot);
        boolean r = preOrder(root.right, subRoot);
        return l || r;
    }


    public boolean sameTree(TreeNode root , TreeNode subRoot){
        
        if(root == null && subRoot == null){
            return true;
        }
        if(root != null && subRoot != null){
            if(root.val != subRoot.val) return false;
        }
        if(root == null && subRoot!= null || root != null && subRoot == null) return false;

        boolean left = sameTree(root.left,subRoot.left) ;
        boolean right = sameTree(root.right,subRoot.right) ;
        return left &&  right;

    }
}