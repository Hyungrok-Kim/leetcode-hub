class Solution {
    private List<List<Integer>> combinationFactory = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = candidates.length - 1, iLimit = 0; i >= iLimit; --i) {
            List<Integer> combinations = new ArrayList<>();
            getCombi(candidates, target, i, combinations);
        }

        return combinationFactory;
    }

    private void getCombi(int[] candidates, int target, int idx, List<Integer> combinations) {
        combinations.add(candidates[idx]);
        target -= candidates[idx];

        if (target == 0) {
            combinationFactory.add(combinations);
            return ;
        }

        if (target < 0)
            return ;

        for (int i = idx, iLimit = 0; i >= iLimit; --i) {
            List<Integer> newCombi = new ArrayList<>(combinations);
            getCombi(candidates, target, i, newCombi);
        }

        if (idx == 0)
            return ;
    }
}