class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combine = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; ++i) {
            combine[i] = nums1[i];
        }
        for (int j = nums1.length; j < nums1.length + nums2.length; ++j) {
            combine[j] = nums2[j - nums1.length];
        }
        Arrays.sort(combine);
        int medianIdx = combine.length / 2;
        return combine.length % 2 == 0 ? (double) (combine[medianIdx] + combine[medianIdx - 1]) / 2.0 : combine[combine.length / 2];
    }
}