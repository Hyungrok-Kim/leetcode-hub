class Solution {
    public int singleNumber(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int num : nums) {
            if (result.contains(String.valueOf(num))) {
                result.remove(String.valueOf(num));
            } else {
                result.add(String.valueOf(num));
            }
        }
        return Integer.parseInt(result.get(0));   
    }
}