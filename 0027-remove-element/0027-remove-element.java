class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1) {
            if (nums[0] == val)
                return 0;
            else
                return 1;
        }

        Integer removeCount = 0, changeIdx = nums.length - 1;
        for (int i = 0, iLimit = nums.length; i < iLimit; ++i) {
            if (i > changeIdx)
                break;

            if (nums[i] == val) {
                removeCount++;

                while (true) {
                    if (i >= changeIdx)
                        break;

                    if (nums[changeIdx] == val)
                        removeCount++;

                    if (nums[changeIdx] != val)
                        break;

                    changeIdx--;
                }

                if (nums[changeIdx] != val) {
                    int temp = 0;
                    temp = nums[i];
                    nums[i] = nums[changeIdx];
                    nums[changeIdx] = temp;
                    changeIdx--;
                }
            }
        }

        return nums.length - removeCount;
    }
}