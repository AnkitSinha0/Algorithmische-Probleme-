class Solution {
    public long countValidSubstrings(String s) {
        long cnt = 0;
        int i = 0;
        for(int j = 0 ; j < s.length() ; j++){
            while((j-i+1) >2 &&
              s.charAt(j) == 'c' && s.charAt(j-1) == 'b' && s.charAt(j-2) == 'a'){
                // i++;
                i = j - 1;
            }
            cnt+= (j - i + 1);
            
        }

        return cnt;

        // what is question asking it says 
        // 1 return all valid substrings
        // 2 what is a substring a contiguous non-empty sequence
        // 3 what is a invalid substring any substring/string having "abc" as substring
        // one thing i noticed is that length of stign can be upto 10^5 so a O(n^2) is gonna tle 
        // i didnt think of brute but it would prbaly be generating all subtring and then check whtehr it is valuid or not and then cnt++
        // anpther way would be if we fix end point j and from certain i there are j - i + 1 starting points for all substrings
        // but now question arises how do we know which is valid and which is not valid ?
        // "abc" means we need to just check j , j-1 , j-2 character to figure if a substrign from i  to j has it or not 
        // suppose we have a substring i to j i.e "aabca"
        // j is 3 and i is 0 we know that if we check j , j-1,j-2 we get abc as substring what can we conclude from it ?
        // we can conlcude that all starts from i until the j-2 are invalid why beacuse they will conatin "abc " on;ly way to break it is remove the a from abc that is we take i and move it to j - 1;
       
        }
}