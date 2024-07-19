class Solution {
    fun lengthOfLastWord(s: String): Int {
        val sArray = s.trimEnd().split(" ")
        return sArray[sArray.size - 1].length
    }
}