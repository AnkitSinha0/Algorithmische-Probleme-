class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = next(n);

        while (fast != 1 && slow != fast) {
            slow = next(slow);         // 1 step
            fast = next(next(fast));   // 2 steps
        }

        return fast == 1;
    }

    private int next(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}