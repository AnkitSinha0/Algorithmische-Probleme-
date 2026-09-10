class Solution {
    public int search(int[] nums, int target) {
    int left = 0 ;
    int right = nums.length -1;

    while(left <= right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < nums[right]){
            if(target > nums[mid] && target <= nums[right]){
                left =mid + 1;
            }else{
                right = mid - 1;
            }
        }else{
            if(target < nums[mid] && target >= nums[left]){
                right = mid  -1;

            }else {
                left = mid + 1;
            }
        }

    } 
        return -1;

    }
}

// class Solution {
//     public int search(int[] nums, int target) {
       
//        return   bS(nums,target);
//     }

//     private int bS(int[] nums, int target){
//         int start =  0;
//         int end = nums.length - 1 ;
//         while(start <= end){
//             int mid = start + (end -  start )/2;
//             if(nums[mid] == target){
//                 return mid;
//             }
//             if(nums[start]<=nums[mid]){
                
//                 if(target >= nums[start] && target <=  nums[mid] ){
                   
//                     end =  mid ;
                    
//                 }else{
//                     start =  mid +1;
//                 }
//             }else{
//                 if(nums[mid+1] <= target && target <=  nums[end] ){
//                     start = mid +1;
//                 }else{
//                     end =  mid;
//                 }

//             }
            
//         }
//         return -1;
// }}