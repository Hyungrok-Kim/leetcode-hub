class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) != null) {
                map.remove(num);
            } else {
                map.put(num, num);
            }
        }

        Set<Integer> integers = map.keySet();
        return integers.stream().findFirst().get();
    }
}