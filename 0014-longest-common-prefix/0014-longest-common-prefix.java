class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        Character before;
        for (int i = 0; true; ++i) {
            if (strs[0].length() - 1 >= i)
                before = strs[0].charAt(i);
            else 
                return result;

            for (String str : strs) {
                if (str.length() > i && str.charAt(i) == before) 
                    continue;
                else 
                    return result;
                
            }

            result += strs[0].charAt(i);
        }
    }
}