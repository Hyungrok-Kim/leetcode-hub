class Solution {
    
    private final Map<Character, Integer> magazineCountMap = new HashMap<>();

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.isEmpty()) {
            return false;
        }
        for (char c : magazine.toCharArray()) {
            Integer targetCount = this.magazineCountMap.getOrDefault(c, 0);
            this.magazineCountMap.put(c, targetCount + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            Integer targetCount = this.magazineCountMap.getOrDefault(c, 0);
            if (targetCount == 0) {
                return false;
            }
            this.magazineCountMap.put(c, targetCount - 1);
        }
        return true;
    }
}