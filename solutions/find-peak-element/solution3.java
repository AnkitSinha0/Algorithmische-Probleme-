class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }

        return n - 1;
    }
}
// class Solution {
//     public int findPeakElement(int[] nums) {
//       int index = 0;

// for (int i = 1; i < nums.length; i++) {
//     if (nums[i] > nums[index]) {
//         index = i;
//     }
// }

// return index;
        
//     }
// }