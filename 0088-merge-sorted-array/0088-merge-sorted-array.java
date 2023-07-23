class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (; index < nums2.length + m; ++index) {
            nums1[index] = nums2[index - m];
        }

        Arrays.sort(nums1);
    }
}