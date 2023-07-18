class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] block : matrix) {
            if (block[block.length - 1] >= target) {
                int startIdx = 0, endIdx = block.length - 1, targetIdx = 0;

                while (startIdx <= endIdx) {
                    targetIdx = startIdx + (endIdx - startIdx) / 2;

                    if (block[targetIdx] == target) {
                        return true;
                    } else if (block[targetIdx] > target) {
                        endIdx = targetIdx - 1;
                    } else if (block[targetIdx] < target) {
                        startIdx = targetIdx + 1;
                    }
                }
            }
        }
        return false;
    }
}