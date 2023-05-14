class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        
        String intToString = "";
        Boolean minusCheck = false;
        if (x <= 0) {
            intToString = String.valueOf(x).substring(1);
            minusCheck = true;
        } else {
            intToString = String.valueOf(x);
        }
        
        char[] charArr = intToString.toCharArray();
        for (int i = 0, iLimit = charArr.length / 2; i < iLimit; ++i) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 -i];
            charArr[charArr.length - 1 -i] = temp;
        }

        Long resultStr = Long.parseLong(minusCheck ? "-" + String.valueOf(charArr) : String.valueOf(charArr));
        if (resultStr <= Integer.MAX_VALUE && resultStr >= Integer.MIN_VALUE)
            return resultStr.intValue();

        return 0;
    }
}