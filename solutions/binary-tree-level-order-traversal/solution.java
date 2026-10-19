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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }

        q.offer(root);
        int num = 0;
        while(!q.isEmpty()){
            if(num == 0 ){
               num = q.size(); 
            }
            TreeNode curr = q.poll();
            temp.add(curr.val);

            if(temp.size() == num){
                list.add(new ArrayList<>(temp));
                temp.clear();
                num=0;
            }
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null)q.offer(curr.right);

            

        }

        return list;
    }
}