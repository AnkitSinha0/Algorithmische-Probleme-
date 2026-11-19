/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // buddy why even seperatly write this null case?
        // if(root == null) return null;
        if (root == null|| root == p || root == q) {
            return root;
        }
        if(p.left == q || p.right == q) return p;
        if(q.right == p || q.left == p )return q;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        if(l!= null && r!=null ){
            return root;
        }
        // dont write long ahh if else
        // if(l != null){
        //     return l;
        // }else if(r!=null){
        //     return r;
        // }else{
        //     return null;
        // }
        return l == null ? r : l;

    }
}