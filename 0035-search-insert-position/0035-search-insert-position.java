class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean up = false, down = false;
        int i = 0;
        for (int iLimit = nums.length; i < iLimit; ++i) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] < target) {
                    up = true;
                } else {
                    down = true;
                }
                if (i == 0 && nums[i] > target) {
                    return 0;
                }
            }
            if (up && down) {
                return i;
            }
        }
        return i;
    }
}