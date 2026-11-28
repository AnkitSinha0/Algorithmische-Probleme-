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
    int cnt = 0 ;
    public int pathSum(TreeNode root, int targetSum) {
        cnt = 0 ;
        dfs(root,targetSum);
        return cnt;
    }
    public void dfs(TreeNode root, int tS){

        if(root == null) return;
        cnt(root,tS,0);
        dfs(root.left,tS);
        dfs(root.right,tS);

    }
    public void cnt(TreeNode root , int tS, long currSum){
        if(root == null) return;
        long sum = currSum+root.val;
        if(sum == tS) cnt++;
        cnt(root.left,tS,sum);
        cnt(root.right,tS,sum);


    }
}