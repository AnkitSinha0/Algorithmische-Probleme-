// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int  n = nums.length;
//         int []  arr = new int[n*2];
//         for(int i = 0 ; i < n*2 ; i++){
//             arr[i] = nums[i%n];
//         }

//         return arr;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int []  arr = new int[nums.length*2];

        System.arraycopy(nums,0,arr,0,nums.length);
        System.arraycopy(nums,0,arr,nums.length,nums.length);
        return arr;
        
    }
}