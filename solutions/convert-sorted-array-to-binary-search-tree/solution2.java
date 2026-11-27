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
    public TreeNode sortedArrayToBST(int[] nums) {
      return Dihh(0,nums.length-1 , nums);
    }
    public TreeNode Dihh(int l , int r ,int [] nums){
        if(l > r){
            return null;
        }
        int mid = l + ( r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = Dihh(l , mid - 1 , nums);
        root.right = Dihh(mid + 1, r , nums);

        return root;
    }
}
// class Solution {
//     public TreeNode sortedArrayToBST(int[] nums) {
//         int left = 0;
//         int right = nums.length - 1;
//         TreeNode root = new TreeNode();
//         return recursiveDihh(root, left, right, nums);
//     }

//     public TreeNode recursiveDihh(TreeNode root, int l, int r, int[] nums) {
//         if (l > r)
//             return null;
//         int mid = l + (r - l) / 2;
//         root.val = nums[mid];
//         // construct the left subtree recursively 
//         if (mid - 1 >= l) {
//             root.left = new TreeNode();
//             recursiveDihh(root.left, l, mid - 1, nums);
//         }
//         // construct the right subtree recursively
//         if (mid + 1 <= r) {
//             root.right = new TreeNode();
//             recursiveDihh(root.right, mid + 1, r, nums);
//         }
//         return root;
//     }
// }