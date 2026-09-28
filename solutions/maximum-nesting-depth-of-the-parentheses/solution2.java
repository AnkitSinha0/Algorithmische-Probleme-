class Solution {
    public int maxDepth(String s) {
        Deque <Character> stack = new ArrayDeque<>();
     
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
              
                stack.push(c);
            }else if(c == ')'){
                
                
                max = Math.max(stack.size() , max);
                stack.pop();
            }
        }
        return max;
    }
}