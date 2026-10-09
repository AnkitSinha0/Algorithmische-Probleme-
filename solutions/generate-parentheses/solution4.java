
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        StringBuilder sb = new StringBuilder();

        backTrack(list,sb,open ,close);
        return list;

    }

    public void backTrack(List<String> list ,StringBuilder sb, int open , int close){
        if(open == 0 && close == 0){
            list.add(sb.toString());
            return ;
        }
        if(open > 0){
            sb.append("(");
            backTrack(list,sb,open - 1, close);
            sb.deleteCharAt(sb.length() - 1);

        }if(close > open){
            sb.append(")");
            backTrack(list,sb,open , close - 1);
            sb.deleteCharAt(sb.length() - 1);

            

        }
    }
}
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> list = new ArrayList<>();
//         int open = n;
//         int close = n;
//         String s = "(";
//         return genRecur(list,open-1,close,s);

//     }
//     public List<String> genRecur(List<String> list ,int open , int close,String s){
        
//         if(open == 0 && close == 0){
//         list.add(s);
//             return list;
//         }
//         if(open > 0){
//            genRecur(list,open-1,close,s + "(")  ;
//         }
//         if(close > open){

//            genRecur(list,open,close-1,s + ")");
//         }  

//         return list;

//     }
// }

// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> list = new ArrayList<>();
//         int open = n;
//         int close = n;
//         String s = "";
//          genRecur(list,open,close,s);
//          return list;

//     }
//     public void genRecur(List<String> list ,int open , int close,String s){
        
//         if(open == 0 && close == 0){
//         list.add(s);
//             return ;
//         }
//         if(open > 0){
//            genRecur(list,open-1,close,s + "(")  ;
//         }
//         if(close > open){

//            genRecur(list,open,close-1,s + ")");
//         }  

//         return ;

//     }
// }