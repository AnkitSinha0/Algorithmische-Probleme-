class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();
        
        char []  ch = new char[s1 + s2];
        int idx = 0 ;
        int id1 = 0 ;
        int id2 = 0 ;
        while(id1 < s1 && id2 < s2){
            if(idx%2 == 0){
                ch[idx++] = word1.charAt(id1++);
            }else{
                ch[idx++] = word2.charAt(id2++);
            }
        }
        while(id1<s1){
            ch[idx++] = word1.charAt(id1++);
        }
           while(id2<s2){
            ch[idx++] = word2.charAt(id2++);
        }

        // return String.valueOf(ch);

        return new String(ch);

    }
}