class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0 ;
        int right =  nums.length - 1;
        while(left <= right){
            int mid =  left + (right - left) /2 ;

            if(nums[mid] == target){
                return true;

            }else if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            }
            // remember to add = otherwise cant properly detect the sprted side such as case 
            // [1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1] 
            // consider [13 1 1 1] and [1 12 1  1  1 ]
            else if(nums[mid] <= nums[right]){
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }

        return false;
    }
}