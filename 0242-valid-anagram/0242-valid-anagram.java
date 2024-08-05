class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            Integer charCount = charCountMap.getOrDefault(c, 0);
            if (charCount == 0) {
                return false;
            }
            charCountMap.put(c, --charCount);
        }
        return true;
    }
}