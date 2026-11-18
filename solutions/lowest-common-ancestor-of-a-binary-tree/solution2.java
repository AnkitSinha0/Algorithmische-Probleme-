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
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
 ans = null;
        lca(root,p,q);
        return ans;
    }
    public boolean lca(TreeNode root,TreeNode p ,TreeNode q){
        if(root == null || ans!=null){
            return false;
        }

        boolean l = lca(root.left , p , q);
        boolean r = lca(root.right , p , q);
        boolean self = root == p || root == q ? true : false;
        if( l && r || l && self || r && self){
            ans = root;
        }
        return self || l || r;

    }
}