func findWordsContaining(words []string, x byte) []int {
    var arr [] int 
    for i := 0 ; i < len(words) ; i++{
        if strings.ContainsRune(words[i] ,rune(x)) {
            arr =append(arr,i);
        }

    }
        return arr

}