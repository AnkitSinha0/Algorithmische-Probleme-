class Solution {
    public int minRange(int a, int b, int c) {

        int [] arr = {a,b,c};
        Arrays.sort(arr);
        int x = arr[0] , y = arr[1] , z = arr[2];
        return Math.min(z-x,y);

        // int [] arr = {a,b,c};
        //      Arrays.sort(arr);    
        // while(arr[0] + arr[1] != arr[2]  ){
        //     int max = arr[2];
        //     int min = arr[0];
        //     if(min +  arr[1] > max){
        //         break;
        //     }else{
        //         arr[2] = min + arr[1];
        //     }
        // }
        // return arr[2] - arr[0];
    }
}