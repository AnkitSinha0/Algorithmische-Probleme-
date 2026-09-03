class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList <Integer> list = new ArrayList<>();
          Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0 ; i < nums1.length ; i++){
            if(i > 0){
                if( nums1[i] == nums1[i - 1] ){
                    continue;
                }
            }

            if(bS(nums2, nums1[i])){
                list.add(nums1[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean bS(int [] nums2 , int k){
        int left = 0;
        int right = nums2.length - 1;

        while(left <= right){
            int mid =  left + (right - left)/2;
            if(nums2[mid] == k ){
                return true;
            }else if(nums2[mid] < k){
                left = mid  + 1;
            }else{
                right = mid - 1;
            }
        }

        return false;
    }
}

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         boolean[] flag = new boolean[1001];

//         for(int num : nums1){
//             flag[num]=true;
//         }
//         int[] result= new int[Math.min(nums1.length, nums2.length)];
//         int index=0;

//         for(int num: nums2){
//             if( flag[num]){
//                 result[index++]=num;
//                 flag[num]=false;
//             }
//         }
//         return Arrays.copyOf(result, index);
//     }
// }
// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {

//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> ans = new HashSet<>();

  
//         for (int num : nums1) {
//             set.add(num);
//         }

//         for (int num : nums2) {
//             if (set.contains(num)) {
//                 ans.add(num);
//             }
//         }

       
//         int[] result = new int[ans.size()];
//         int i = 0;

//         for (int num : ans) {
//             result[i++] = num;
//         }

//         return result;
//     }
// }


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {

//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int num : nums1) {
//             set.add(num);
//         }

//         for (int num : nums2) {
//             if (set.remove(num)) { 
//                 list.add(num);
//             }
//         }

//         // int[] ans = new int[list.size()];
//         // for (int i = 0; i < list.size(); i++) {
//         //     ans[i] = list.get(i);
//         // }

//         // return ans;
//         return list.stream().mapToInt(Integer::intValue).toArray();
        
//     }
// }