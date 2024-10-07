/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int startIdx = 0;
        int endIdx = n;
        while (startIdx <= endIdx) {
            int midIdx = startIdx + (endIdx - startIdx) / 2;
            if (isBadVersion(midIdx)) {
                if (!isBadVersion(midIdx - 1)) {
                    return midIdx;
                }
                endIdx = midIdx - 1;
            } else {
                startIdx = midIdx + 1;
            } 
        }
        return 0;
    }
}