class Solution {
    public void reverseString(char[] s) {
    
        int left = 0;
        int right = s.length - 1;
        reCur(s,left,right);
    }
    public void reCur(char[] s , int left , int right) {
        if(left > right){
            return;
        }
        reCur(s,left+1,right-1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

    }
}

// class Solution {
//     public void reverseString(char[] s) {
//         int l = 0;
//         int r = s.length - 1;
//         while(l < r){
//             char temp = s[l];
//             s[l] = s[r];
//             s[r] = temp;
//             l++;
//             r--;
//         }

        
//     }
// }