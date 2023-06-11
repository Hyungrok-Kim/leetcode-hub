import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aBi = new BigInteger(a, 2);
        BigInteger bBi = new BigInteger(b, 2);

        return aBi.add(bBi).toString(2);
    }
}

