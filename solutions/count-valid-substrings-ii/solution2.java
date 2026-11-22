class Solution {
    public long countValidSubstrings(String s) {
    long cnt = 0 ;
    int lastA = -1 , lastAB = - 1 ,lastABC = -1;
    for(int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i);
        if(c == 'a') lastA = i;
        else if(c == 'b') lastAB = lastA;
        else lastABC = lastAB;
        cnt+= i - lastABC;
    }
    return cnt;
    }
    //    int n = s.length();
    //     int lastA = -1, lastAB = -1, lastABC = -1;
    //     long ans = 0;
    //     for (int r = 0; r < n; r++) {
    //         char c = s.charAt(r);
    //         if (c == 'a') lastA = r;
    //         else if (c == 'b') lastAB = lastA;
    //         else lastABC = lastAB;
    //         ans += r - lastABC;
    //     }
    //     return ans;
    // }
}