class Solution {
    public int firstMissingPositive(int[] nums) {
      int [] arr = new int [nums.length + 2];
      for(int x : nums){
        if(x > 0 && x <nums.length+2) arr[x]++;

      }

      for(int i = 1 ; i <= nums.length+1 ; i++){
        if(arr[i]==0) return i;
      }

      return 1;
    }
}


// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         HashSet <Integer> set = new HashSet<>();
//         int max = Integer.MIN_VALUE;
//         for(int x : nums){
//             set.add(x);
//             if(x > max) max = x;
//         }
//         if(max < 0) return 1;
//         for(int i = 1 ; i <= max ; i++){
//             if(!set.contains(i)){
//                 return i;
//             }
//         }
//         return max+1;
//     }
// }