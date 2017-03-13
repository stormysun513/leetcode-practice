public class Solution {
    public int minMoves2(int[] nums) {
        if(nums == null | nums.length == 0) return 0;

        int length = nums.length;
        int count = 0;
        if(length%2 == 1){
            int mid = findIdx(nums, 0, length-1, length/2);
            System.out.println(Arrays.toString(nums));
            for(int num: nums){
                count += Math.abs(num-mid);
            }
            return count;
        }
        else{
            int mid = (findIdx(nums, 0, length-1, length/2) + findIdx(nums, 0, length-1, length/2-1))/2;
            int check = 0;
            for(int num: nums){
                count += Math.abs(num-mid+1);
                check += Math.abs(num-mid);
            }
            return Math.min(count, check);
        }
    }

    public int findIdx(int[] nums, int start, int end, int idx){
        int pivot = partition(nums, start, end);
        if(pivot < idx){
            return findIdx(nums, pivot+1, end, idx);
        }
        else if(pivot > idx){
            return findIdx(nums, start, pivot-1, idx);
        }
        else{
            return nums[pivot];
        }
    }

