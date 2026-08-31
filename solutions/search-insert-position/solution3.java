// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         return bS(nums,target);
//     }
//     private int bS(int [] nums , int target){
//         int start = 0 ;
//          int end =  nums.length -1 ;
//          int ans = nums.length;
//          while(start <= end){
//         int mid = start + (end  -  start )/2;
//         if(nums[mid]>=target){
//             ans = mid;
//             end = mid - 1;
//         }else{
//             start = mid + 1;
//         }
//          }
//          return ans;

//     }
// }
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         return binarySex(nums , target);
    
       
//     }
//     public int binarySex(int [] n , int k){
//         int left = 0;
//         int right = n.length - 1;
//         int ans = 0;
//         int mid = 0;
//         while(left <= right){
//              mid = left + (right - left)/2;
            
//             if(n[mid] ==  k){
//                 return mid;
//             }else if(n[mid] > k){
//                 right = mid - 1;
//             }else{
//                left   = mid + 1;
//             }

//         }
//         return n[mid] < k ? mid +1 : mid;
        
//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        
    
       
    int left = 0 ;
    int right = nums.length-1;

    while(left < right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
            left = mid + 1;
        }else{
            right = mid;
        }
    }
    return nums[right] < target ? right + 1 : right;
    }
}