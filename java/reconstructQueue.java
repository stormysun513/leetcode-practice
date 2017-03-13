public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] p1, int[] p2)->{
            if(p2[0] != p1[0]){
                return Integer.compare(p2[0], p1[0]);
            }
            else{
                return Integer.compare(p1[1], p2[1]);
            }
        });

        for(int i = 1; i < people.length; i++){
            int k = i-people[i][1];
            int j = i;
            while(k > 0){
                int temp0 = people[j-1][0];
                int temp1 = people[j-1][1];
                people[j-1][0] = people[j][0];
                people[j-1][1] = people[j][1];
                people[j][0] = temp0;
                people[j][1] = temp1;
                j--;
                k--;
            }
        }
        return people;
    }
}
