class Solution {
    public int firstUniqChar(String s) {
        int [] freq = new int[26];
        char [] chr  = s.toCharArray();
        for(char c : chr){
            freq[c-'a']++;
        }
        for(int i = 0 ; i < chr.length ; i++){
            if(freq[chr[i] -'a'] == 1){
                return i;
            }
        }

        return -1 ;
    }
}