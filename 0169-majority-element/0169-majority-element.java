class Solution {
    public int majorityElement(int[] nums) {
        int halfLength = nums.length / 2;
        Arrays.sort(nums);
        return nums[halfLength];
    }
}