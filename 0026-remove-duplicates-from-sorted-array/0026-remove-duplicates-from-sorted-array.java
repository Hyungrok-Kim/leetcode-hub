class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int addIndex = 1;
        for(int i = 0, iLimit = nums.length; i < iLimit - 1; ++i) {
            if (nums[i] < nums[i + 1]) {
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }

        return addIndex;
    }
}