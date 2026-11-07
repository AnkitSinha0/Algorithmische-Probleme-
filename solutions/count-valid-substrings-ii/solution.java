class Solution {
    public long countValidSubstrings(String s) {
       int n = s.length();
        int lastA = -1, lastAB = -1, lastABC = -1;
        long ans = 0;
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            if (ch == 'a') lastA = r;
            else if (ch == 'b') lastAB = lastA;
            else lastABC = lastAB;
            ans += r - lastABC;
        }
        return ans;
    }
}