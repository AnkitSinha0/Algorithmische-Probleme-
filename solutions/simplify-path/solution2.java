class Solution {
    public String simplifyPath(String path) {
        Stack <String> process = new Stack<>();

        String [] folders = path.split("/");

        for(String folder : folders){
            if(folder.equals(".") || folder.equals("")){
                continue;
            }else if(folder.equals("..")){
                if(!process.isEmpty()){
                    process.pop();
                }
            }else{
                process.push(folder);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(String folder : process){
            ans.append('/').append(folder);
        }

        return ans.length() == 0 ? "/" : ans.toString();

    }
}
// messy ahh code
// class Solution {
//     public String simplifyPath(String path) {
//         StringBuilder sb = new StringBuilder();
//         StringBuilder temp = new StringBuilder();
//         ArrayDeque < String > stack = new ArrayDeque < > ();
//         for (int i = 0; i < path.length(); i++) {
//             char c = path.charAt(i);

//             if (c == '/') {
//                 if(temp.toString().equals("..")){
//                     if(!stack.isEmpty()){
//                     stack.pop();

//                     }
//                 }
//                 else if(temp.toString().equals(".")){
                  
//                 }else if(temp.length() > 0 ){
//                     stack.push(temp.toString());
//                 }
//                 temp.setLength(0);

//                 continue;
//             } else {

//                 temp.append(c);

//             }
//         }
//         // this is wrong cause you cant modify a stack while using iterator!!!
//         //    for(StringBuilder s : stack){
//         // sb.append('/').append(stack.removeLast().toString());
//         //    }
//         // this could be used when we use addLast when pushing 
//         // for(String s : stack){
//         //     sb.append('/').append(s);
//         // }
//         System.out.println(temp);
//         System.out.println(stack.peek());
//         if (temp.length() != 0) {
//              if(temp.toString().equals("..") ){
//                     if( !stack.isEmpty()){
//                     stack.pop();

//                     }
//                 }
//                 else if(temp.toString().equals(".") ){
                    
//                 }else if(temp.length() >= 1 ){
//                     stack.push(temp.toString());
//                 }
//         }
//         while (!stack.isEmpty()) {
//             String s = stack.removeLast();
//             sb.append("/").append(s);

//         }
//         return sb.length() == 0 ? "/" : sb.toString();

//     }
// }