public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new LinkedList<String>();
        int pattern = 0;
        int ubound_mask = (1 << 10);

        while((pattern & ubound_mask) == 0){
            if(getNumBits(pattern) == num && isValidPattern(pattern)){
                String hrs = getHours(pattern);
                String mins = getMinutes(pattern);
                ans.add(hrs + ":" + mins);
            }
            pattern += 1;
        }
        return ans;
    }

    public boolean isValidPattern(int pattern){
        int min_mask = (1 << 6)-1;
        int hr_mask = (1 << 4)-1;
        int check = (pattern & min_mask);
        if(check >= 60) return false;
        check = (pattern >> 6) & hr_mask;
        if(check >= 12) return false;
        return true;
    }

    public int getNumBits(int pattern){
        int mask = (1 << 10)-1;
        int temp = pattern & mask;
        int count = 0;
        while(temp != 0){
            count += (temp & 1);
            temp >>= 1;
        }
        return count;
    }

    public String getMinutes(int pattern){
        int mask = (1 << 6)-1;
        int result = pattern & mask;
        if(result < 10)
            return ("0" + Integer.toString(mask & pattern));
        else
            return Integer.toString(mask & pattern);
    }

    public String getHours(int pattern){
        int  mask = (1 << 4)-1;
        return Integer.toString(mask & (pattern >> 6));
    }
}
