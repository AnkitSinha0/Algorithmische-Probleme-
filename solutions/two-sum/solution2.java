
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         HashMap <Integer,Integer> map  = new HashMap<>();


//     for(int i  = 0 ;  i < nums.length;i++){

//         int x = target - nums[i];
//         if(map.containsKey(x)){
//             return new int[] {i,map.get(x)};
//         }

//         map.put(nums[i],i);
//     }

//     return new int[] {0,0};


//     }


// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                if(nums[j - i] + nums[j] == target){
                    return new int[] {j - i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}