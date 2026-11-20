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
//  class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         dihh(root,list);
//         return list;
//     }
//     public void dihh(TreeNode root,List<Integer>){

//         if(root == null)return;
//         if(list)
//         list.add(root.val);


//     }
// }
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = null;
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                temp = q.poll();
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            list.add(temp.val);

        }

        return list;
    }

}