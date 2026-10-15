// class Solution {
//     public int sumCounts(List<Integer> nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int res = 0;
//         for(int i = 1 ; i <= nums.size() ;  i++ ){
            
//             for(int j = 0 ; j <= nums.size() - i ; j++){

//                 for(int k = j ; k < j + i ; k++){
//                     set.add(nums.get(k));
//                 }
//                 int x = set.size();
//                 res+= x*x;
//                 set.clear();
//             }
//         }

//         return res;
//     }
// }

class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans =  0;
        int size = nums.size();

        for(int i = 0 ; i < size ; i++){
            HashSet <Integer> set = new HashSet<>();
            for(int j = i ; j < size ; j++){
                set.add(nums.get(j));
                int len = set.size();
                ans += len*len;
            }
        }

        return ans;
    }
}