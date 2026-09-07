// MY brute force O(n)  + O(m) + O((m+n)log (m+n));
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] arr = new int[m+n];

        for(int i = 0 ; i < m ; i++){
            arr[i] = nums1[i];
        }           

        for(int i = 0 ; i < n ; i++){
            arr[i+m] = nums2[i] ;
        }
        Arrays.sort(arr);
        if((m+n)%2 != 0){
            return (double) arr[(m+n)/2] ;
            

        }else{
           
            return   ((arr[(m+n)/2] + arr[(m+n)/2 - 1])/2.0);
        }
    }
}


// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list=new ArrayList<>();
        
//         for(int i=0;i<nums1.length;i++){
//             list.add(nums1[i]);
//         }

//         for(int i=0;i<nums2.length;i++){
//             list.add(nums2[i]);
//         }

//         Collections.sort(list);

//         int n=list.size();

//         if(n %2 == 1){
// auto conversion to double
//             return list.get(n/2);
//         }
// If we don't use 2.0, integer division loses the decimal part.
// (2 + 3) / 2 → 5 / 2 → 2
// Then the final int 2 is converted to double → 2.0.
// Using 2.0 makes it floating-point division → 2.5.
// return (list.get(n/2 - 1) + list.get(n/2)) / 2.0;
//     }
// }

