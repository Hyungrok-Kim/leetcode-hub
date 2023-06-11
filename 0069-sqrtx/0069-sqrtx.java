class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int left = 1, right = x;
        while (left < right) {
            int target = left + (right - left) / 2;

            if (x / target == target) {
                return target;
            } else if (x / target > target) {
                left = target + 1;
            } else {
                right = target;
            }
        }
        return left - 1;
    }
}