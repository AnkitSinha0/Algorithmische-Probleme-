func minRange(a int, b int, c int) int {
    if(a > b) {b , a = a , b}
    if(a > c) {a , c = c , a}
   if(b > c){b , c = c ,b} 
   return min(b , c-a)
}