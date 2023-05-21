class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1 && nums[0] != target) return -1;

        boolean rotated = false;

        int maxNum = Integer.MIN_VALUE;
        int maxNumIdx = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (maxNum > nums[i]) {
                rotated = true;
                break;
            } else {
                maxNum = nums[i];
                maxNumIdx = i;
            }
        }
        int startIdx = 0, endIdx = nums.length - 1, zeroLocation = Integer.MAX_VALUE, result = 0;

        if (rotated) {
            if (nums[0] <= target && nums[maxNumIdx] >= target) endIdx = maxNumIdx;
            else if (nums[nums.length - 1] >= target) startIdx = maxNumIdx + 1;
            else return -1;
        }

        while ((endIdx - startIdx != 1 && endIdx - startIdx != 0)) {
            int targetIdx = (startIdx + endIdx) / 2;

            if (nums[targetIdx] == target) {
                return targetIdx;
            } else if (nums[targetIdx] > target) {
                endIdx = targetIdx;
            } else if (nums[targetIdx] < target) {
                startIdx = targetIdx;
            }
        }

        if (nums[startIdx] == target) return startIdx;
        if (nums[endIdx] == target) return endIdx;

        return -1;
    }
}