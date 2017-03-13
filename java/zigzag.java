public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 0 || s == null || s.equals("")) return "";

        StringBuilder[] sb = new StringBuilder[numRows];
        int npc1 = numRows;
        int npc2 = (numRows <= 2) ? 1 : (npc1-2);
        int idx = 0;
        int length = s.length();
        for(int i = 0; i < sb.length; i++) {
            sb[i]=new StringBuilder("");
        }

        while(idx < length){
            for(int i = 0; idx < length && i < npc1; i++, idx++){
                sb[i].append(s.charAt(idx));
            }

            if(npc1 > 2){
                for(int i = npc2; idx < length && i >= 1; i--, idx++){
                    sb[i].append(s.charAt(idx));
                }
            }
        }
        for(int i = 1; i < numRows; i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
