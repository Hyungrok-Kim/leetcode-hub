/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var startIdx = 0
        var endIdx = n
        while (startIdx <= endIdx) {
            val midIdx = startIdx + (endIdx - startIdx) / 2
            when {
                isBadVersion(midIdx) && !isBadVersion(midIdx - 1) -> return midIdx
                isBadVersion(midIdx) -> endIdx = midIdx - 1
                else -> startIdx = midIdx + 1
            }
        }
        return 0
	}
}