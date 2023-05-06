class Solution {
    public boolean isPalindrome(int x) {
        
        String target = Integer.toString(x);
        
        for (int i = 0; i < target.length() / 2; ++i) {
            if (target.charAt(i) != target.charAt(target.length() - 1 - i)) return false;
        }
        
        return true;
    }
}