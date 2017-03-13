public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] t1 = version1.split("\\.");
        String[] t2 = version2.split("\\.");

        int bound = (t1.length > t2.length)? t2.length : t1.length;
        for(int i = 0; i < bound; i++){
            int res = Integer.compare(Integer.parseInt(t1[i]), Integer.parseInt(t2[i]));
            if(res > 0){
                return 1;
            }
            else if(res < 0){
                return -1;
            }
        }
        if(t1.length == t2.length){
            return 0;
        }
        else{
            if(t1.length > t2.length){
                for(int i = t2.length; i < t1.length; i++){
                    if(Integer.parseInt(t1[i]) > 0) return 1;
                }
            }
            else{
                for(int i = t1.length; i < t2.length; i++){
                    if(Integer.parseInt(t2[i]) > 0) return -1;
                }
            }
            return 0;
        }
    }
}
