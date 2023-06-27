class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (!result.contains(num)) {
                result.add(num);
            } else {
                result.remove(num);
            }
        }
        return result.iterator().next();
    }
}