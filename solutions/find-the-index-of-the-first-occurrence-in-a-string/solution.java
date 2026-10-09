// class Solution {
//     public int strStr(String haystack, String needle) {
//         int h = haystack.length();
//         int n = needle.length();

//         for(int i = 0 ; i < h ; i++){
//             int indH = i;
//             int indN = 0;

//             while( indN < n && indH < h && haystack.charAt(indH)==needle.charAt(indN) ){
                
//                 indH++;
               
//                 indN++; 
//             }
//             if(indN == n) return i;

// // 

//         }
//         return -1;
//     }
// }

// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }

// }

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

