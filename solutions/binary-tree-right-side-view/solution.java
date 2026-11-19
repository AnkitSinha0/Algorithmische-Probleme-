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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        dihh(root, q, list);
        return list;
    }

    public void dihh(TreeNode root, Queue<TreeNode> q, List<Integer> list) {
        while (!q.isEmpty()) {
            if (q.isEmpty())
                return;
            TreeNode temp = null;
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                temp = q.poll();
                if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
                System.out.println(temp.val);
            }
            list.add(temp.val);
            
        }

    }
}