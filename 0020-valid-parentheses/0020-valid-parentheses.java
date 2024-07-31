class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put(')', '(');
        hs.put(']', '[');
        hs.put('}', '{');
        char[] charArr = s.toCharArray();
        if (charArr.length % 2 != 0) {
            return false;
        }
        for (Character c : charArr) {
            if (hs.containsKey(c)) {
                if (!stack.isEmpty() && stack.pop() == hs.get(c)) {
                    continue;                    
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}