class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        create(n, n, result, "");
        return result;
    }

    private void create(int leftCount, int rightCount, List<String> result, String createdResult) {
        if (leftCount == 0 && rightCount == 0) {
            result.add(createdResult);
        } else {
            if (leftCount > 0) {
                create(leftCount - 1, rightCount, result, createdResult + "(");
            }
            if (leftCount < rightCount) {
                create(leftCount, rightCount - 1, result, createdResult + ")");
            }
        }
    }
}