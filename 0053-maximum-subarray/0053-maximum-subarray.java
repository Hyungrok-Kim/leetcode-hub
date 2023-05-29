class Solution {
    
    public int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            bestSum = Math.max(bestSum, curSum);
        }
        return bestSum;
    }
}