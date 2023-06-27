class Solution {
    public int singleNumber(int[] nums) {
            int result = 0;
        //even occurence will nullify
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}