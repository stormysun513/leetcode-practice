ipublic class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ans;
        Set setBuf = new HashSet();
        Set set1 = new HashSet();
        Set set2 = new HashSet();

        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);

        Iterator iterator = set1.iterator();
        while(iterator.hasNext()){
            int num = (int)iterator.next();
            if(set2.contains(num)){
                setBuf.add(num);
            }
        }

        int idx = 0;
        ans = new int[setBuf.size()];
        iterator = setBuf.iterator();
        while(iterator.hasNext()){
            ans[idx++] = (int)iterator.next();
        }
        return ans;
    }
}
