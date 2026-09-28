class Solution {
    public int maxDepth(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        int currCnt = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                currCnt = 0;
                stack.push(c);
            }else if(c == ')'){
                currCnt = stack.size();
                stack.pop();
                max = Math.max(currCnt , max);
            }
        }
        return max;
    }
}