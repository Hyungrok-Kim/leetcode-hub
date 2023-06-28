class Solution {
    public int majorityElement(int[] nums) {
        int halfLength = nums.length / 2;
        List<Integer> collect = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        return collect.get(halfLength); 
    }
}