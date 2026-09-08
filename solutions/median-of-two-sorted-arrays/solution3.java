
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   int n = nums1.length;
   int m = nums2.length;
   int i = 0;
   int j = 0;
   int k =0;
   int [] arr = new int[n+m];
   while(i < n && j < m){
    if(nums1[i] < nums2[j]){
        arr[k] = nums1[i];
        i++;
        k++;
    } else{
        arr[k] = nums2[j];
        j++;
        k++;
    }
   }
   while(i < n){
    arr[k] = nums1[i];
    i++;
    k++;
   }
   while(j < m){
    arr[k] = nums2[j];
    j++;
    k++;
   }
   int x = arr.length;
   if(x % 2 != 0){
    return (double) arr[x / 2];
   }else{
    return (arr[x/2] + arr[(x/2 - 1)]) / 2.0;
   }
    }
}

// MY brute force O(n)  + O(m) + O((m+n)log (m+n));
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int m = nums1.length;
//         int n = nums2.length;
//         int [] arr = new int[m+n];

//         for(int i = 0 ; i < m ; i++){
//             arr[i] = nums1[i];
//         }           

//         for(int i = 0 ; i < n ; i++){
//             arr[i+m] = nums2[i] ;
//         }
//         Arrays.sort(arr);
//         if((m+n)%2 != 0){
//             return (double) arr[(m+n)/2] ;
            

//         }else{
           
//             return   ((arr[(m+n)/2] + arr[(m+n)/2 - 1])/2.0);
//         }
//     }
// }


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

