class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray())  {
            Integer count = countMap.getOrDefault(c, 0);
            countMap.put(c, count + 1);
        }
        boolean isOddExist = false;
        int result = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                result += entry.getValue();
            }
            if (entry.getValue() % 2 == 1) {
                result += entry.getValue() - 1;
                isOddExist = true;
            }
        }
        return isOddExist ? result + 1 : result;
    }
}