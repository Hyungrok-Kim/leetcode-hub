class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;
        boolean findCheck = false;
        int[] result = new int[2];

        while (startIdx <= endIdx) {
            targetIdx = startIdx + (endIdx - startIdx) / 2;

            if (nums[targetIdx] == target) {
                findCheck = !findCheck;
                break;
            } else if (nums[targetIdx] > target) {
                endIdx = targetIdx -1;
            } else if (nums[targetIdx] < target) {
                startIdx = targetIdx + 1;
            }
        }

        if (!findCheck) return new int[] {-1, -1};

        if (nums.length == 1) return new int[] {0, 0};

        for (int i = targetIdx; i >= 0; --i) {
            if (nums[i] != target) {
                result[0] = i + 1;
                break;
            }
            
            if (i == 0) result[0] = 0;
        }

        for (int i = targetIdx; i < nums.length; ++i) {
            if (nums[i] != target) {
                result[1] = i - 1;
                break;
            }
            
            if (i == nums.length - 1) result[1] = nums.length - 1;
        }
        return result;
    }
}