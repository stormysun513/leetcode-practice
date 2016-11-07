public char findTheDifference(String s, String t) {
    int[] table = new int[256];

    for(char c: t.toCharArray()){
        table[c]++;
    }
    for(char c: s.toCharArray()){
        table[c]--;
    }
    for(int i = 0; i < 256; i++){
        if(table[i] > 0){
            return (char)i; 
        }
    }
    return (char)0;
}
