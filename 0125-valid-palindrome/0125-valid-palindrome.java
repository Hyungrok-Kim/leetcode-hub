class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] charArray = s.toCharArray();
        for (int i = 0, iLimit = charArray.length / 2; i < iLimit; ++i) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}