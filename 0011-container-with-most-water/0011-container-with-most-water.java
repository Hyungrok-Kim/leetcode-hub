class Solution {
    // 최적의 x길이와 
    // 최적의 y길이를 찾아야지?
    // 어떻게 찾을 수 있을까? 
    public int maxArea(int[] height) {
        int startIdx = 0, endIdx = height.length - 1, output = 0;
        while (startIdx < endIdx) {
            int xInterval = endIdx - startIdx;
            int yInterval = height[endIdx] > height[startIdx] ? height[startIdx] : height[endIdx];
            if (xInterval * yInterval > output)
                output = xInterval * yInterval;

            if (height[startIdx] <= height[endIdx])
                startIdx++;
            else
                endIdx--;
        }
        return output;
    }
}