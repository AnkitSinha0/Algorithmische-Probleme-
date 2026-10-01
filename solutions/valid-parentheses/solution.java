// class Solution {
//     public boolean isValid(String s) {
      
//         Stack <Character> stack = new Stack <>();
        
//         for(char c : s.toCharArray()){
//             if(c == '(' || c == '{' || c == '['){
//                 stack.push(c);
//             }else{
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 char open = stack.pop();
//                 if(open == '('  && c == ')'){
                    
//                 }else if(open == '[' && c == ']'){

//                 }else if(open =='{'  && c == '}'){

//                 }else{
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
      
//        Deque <Character> stack = new ArrayDeque <>();
        
//         for(char c : s.toCharArray()){
//           if(c == '('){
//             stack.push(')');
//           }else if(c == '{'){
//             stack.push('}');
//           }else if(c == '['){
//             stack.push(']');
//           }else if(stack.isEmpty() || stack.pop() != c){
//             return false;
//           }
//         }
//         return stack.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
       char [] stack = new char [s.length()];
        int top = 0;
        for(char c : s.toCharArray()){
        switch(c){
            case '(' :
            stack[top++] = ')';
            break;
            case '{': 
            stack[top++] = '}';
            break;
            case '[' :
             stack[top++] = ']';
             break;
             default:
             if(top == 0 || stack[--top] != c){
                return false;
             }
        }
        
        }
        return top == 0;
    }
}