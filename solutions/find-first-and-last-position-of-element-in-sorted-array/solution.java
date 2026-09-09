// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int start =  lowerBound(nums, target);
//         int end =  upperBound(nums, target);
//         if(start == nums.length || nums[start] != target){
//             return new int [] {-1,-1};
//         }
        
//         return new int [] {start , end};

//     }
    
//     private int lowerBound ( int []  nums , int k ){
//         int start = 0;
//         int end = nums.length -1;
//         int ans = nums.length;

//         while(start<=end){
//             int mid =  start + (end  - start)/2;

            
//                if(nums[mid]>=k){
//                     ans = mid;
              
                
//                 end  = mid - 1;
//                }

//             else{
//                 start = mid + 1;
//             }

//         }
//         return ans;

//     }
//     private int upperBound ( int []  nums , int k ){
//         int start = 0;
//         int end = nums.length -1;
//         int ans = nums.length;

//         while(start<=end){
//             int mid =  start + (end  - start)/2;

//             if(nums[mid]> k){
                
//                     ans = mid;
                
//               end = mid  - 1;
//             }else{
//                 start  = mid + 1;
                
//             }

//         }
//         return ans - 1;

//     }

// }
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int start =  lowerBound(nums, target);
//         int end =  upperBound(nums, target);
//         if(start >= nums.length || end >= nums.length){
//             return new int[]{-1,-1};

//         }
//         return new int [] {start , end};

//     }
    
//     private int lowerBound ( int []  nums , int k ){
//         int start = 0;
//         int end = nums.length -1;
//         int ans = nums.length;

//         while(start<=end){
//             int mid =  start + (end  - start)/2;

//             if(nums[mid]>= k){
               
//                     ans = mid;
//                 }
                
//                 end  = mid - 1;
//             }else{
//                 start = mid + 1;
//             }

//         }
//         return ans;

//     }
//     private int upperBound ( int []  nums , int k ){
//         int start = 0;
//         int end = nums.length -1;
//         int ans = nums.length;

//         while(start<=end){
//             int mid =  start + (end  - start)/2;

//             if(nums[mid]> k){
                
//                     ans = mid;
                
//               end = mid  - 1;
//             }else{
//                 start  = mid + 1;
                
//             }

//         }
//         return ans - 1;

//     }

// }
class Solution {
    public static int[] searchRange(int[] nums, int target) {
      int start = lowerBound(nums , target);
      int end = upperBound(nums , target);
      return new int[]{start,end};

    }
    public static int lowerBound(int [] nums , int x){
        if(nums.length == 0 ){
            return -1;
        }
        int left  = 0 ;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid]>=x){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return nums[left] == x ? left : -1;
    }

    public static int upperBound(int [] nums , int x){
        if(nums.length ==0 || nums[0] > x){return -1;}
        int left = 0 ;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left + 1)/2;
            if(nums[mid]<= x){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return nums[right]==x ? right : -1; 
    }
}