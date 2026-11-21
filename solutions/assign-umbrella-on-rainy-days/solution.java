class Solution {
    public String[] assignUmbrella(int[] rain) {
        String [] str = new String[rain.length];
        int aCnt = 0;
        int bCnt = 0 ;
       
        for(int i = 0 ; i < rain.length ; i++){
            if(rain[i] == 0 ){
                str[i] = "None";
            }else{

                if(i < rain.length - 1 && rain[i] == rain[i+1] && rain[i] == 1){
                    if(aCnt > bCnt){
                        bCnt++;
                        str[i] = "Bob";
                    }else{
                        aCnt ++;
                        str[i] = "Alice";
                    }
                }else if(i < rain.length - 1 && rain[i] == rain[i+1] ){
                    aCnt++;
                    str[i] = "Alice";
                }else{
                    bCnt++;
                     str[i] = "Bob";
                } 
            }
        }
        return str;
        // String[] ans = new String[rain.length];

        // int aCnt = 0;
        // int bCnt = 0;

        // for (int i = 0; i < rain.length; i++) {

        //     if (rain[i] == 0) {
        //         ans[i] = "None";
        //     } 
        //     else {
        //         if (i < rain.length - 1 && rain[i] == rain[i + 1] && rain[i] == 1) {
        //             if (aCnt > bCnt) {
        //                 ans[i] = "Bob";
        //                 bCnt++;
        //             } else {
        //                 ans[i] = "Alice";
        //                 aCnt++;
        //             }
        //         }
        //         else if (i < rain.length - 1 && rain[i] == rain[i + 1]) {
        //             ans[i] = "Alice";
        //             aCnt++;
        //         }
        //         else if (rain[i] == 1) {
        //             ans[i] = "Bob";
        //             bCnt++;
        //         }
        //     }
        // }

        // return ans;
    }
}