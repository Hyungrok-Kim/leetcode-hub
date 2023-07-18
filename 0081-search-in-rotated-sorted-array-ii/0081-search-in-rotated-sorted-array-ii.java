class Solution {
    public boolean search(int[] nums, int target) {
        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;

        while (startIdx <= endIdx) {
            targetIdx = startIdx + (endIdx - startIdx) / 2;

            if (nums[targetIdx] == target) {
                return true;
            }

            if (nums[startIdx] < nums[targetIdx]) {
                if (nums[startIdx] <= target && target < nums[targetIdx]) {
                    endIdx = targetIdx - 1;
                } else {
                    startIdx = targetIdx + 1;
                }
            } else if (nums[startIdx] > nums[targetIdx]) {
                if (nums[targetIdx] < target && target <= nums[endIdx]) {
                    startIdx = targetIdx + 1;
                } else {
                    endIdx = targetIdx - 1;
                }
            } else {
                startIdx++;
            }
        }

        return false;
    }
}