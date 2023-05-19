class Solution {
    
    private final Map<Character, String[]> strByDigits = Map.of(
        '2', new String[]{"a", "b", "c"},
        '3', new String[]{"d", "e", "f"},
        '4', new String[]{"g", "h", "i"},
        '5', new String[]{"j", "k", "l"},
        '6', new String[]{"m", "n", "o"},
        '7', new String[]{"p", "q", "r", "s"},
        '8', new String[]{"t", "u", "v"},
        '9', new String[]{"w", "x", "y", "z"}
    );
    
    private final List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return new ArrayList<>();
        }
        char[] numberCharacters = digits.toCharArray();
        createCombi(numberCharacters, 0, "");
        return result;
    }

    private void createCombi(char[] numberCharacters, int targetIdx, String combi) {
        if (targetIdx >= numberCharacters.length) {
            result.add(combi);
            return;
        }

        String[] targetAlphabets = strByDigits.get(numberCharacters[targetIdx]);
        for (String targetAlphabet : targetAlphabets) {
            createCombi(numberCharacters, targetIdx + 1, combi + targetAlphabet);
        }

        return;
    }
}