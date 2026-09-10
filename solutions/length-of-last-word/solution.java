class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int ptr = s.length() - 1;
        int cnt = 0 ;
        while(ptr  >= 0){
            if(Character.isLetter(s.charAt(ptr))){
                cnt++;
                ptr--;
                continue;
            }
            break;
        }

        return cnt;
    }
}