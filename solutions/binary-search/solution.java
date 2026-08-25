// class Solution {
//     public int search(int[] nums, int target) {
//         return binarySearch(nums,target);
//     }
//     public int binarySearch(int [] nums , int target){
//         int start = 0;
//         int end = nums.length-1;

       
//         while(start<=end){
//             int mid = start + (end - start)/2;
//             if(nums[mid]<target){
//                 start = mid+1;
//             }else if(nums[mid]>target){
//                 end = mid - 1;
//             }else{
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }
class Solution {
    public int search(int[] nums, int target) {
       return binarySearch(nums,target);
    }
    public int binarySearch(int []  nums , int target){
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            int mid = left +  (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] >target){
                right = mid - 1;
            }else{
                left = mid +1; 
            }
        }
        return -1;
    }
}