class Solution {
    
    public String convert(String s, int numRows) {
       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        int rowIndex = 0;
        int rowStep = 1;
        List<Character>[] rows = new ArrayList[numRows];
        this.setupRows(rows, numRows);
        for (char c : s.toCharArray()) {
            rows[rowIndex].add(c);
            if (rowIndex == 0) {
                rowStep = 1;
            } else if (rowIndex == numRows - 1) {
                rowStep = -1;
            }
            rowIndex += rowStep;
        }
        return this.createResult(rows);
    }
    
    private void setupRows(List<Character>[] rows, int numRows) {
        for (int i = 0, iLimit = numRows; i < iLimit; ++i) {
            rows[i] = new ArrayList<>();
        }        
    }
    
    private String createResult(List<Character>[] rows) {
        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }
        return result.toString();
    }
}