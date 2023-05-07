// IV, IX
// XL, XC
// CD, CM

// I
// V
// X
// L
// C
// D
// M

class Solution {
    
    public int romanToInt(String s) {
        HashMap<String, Integer> oneWordHs = new HashMap<>();
        oneWordHs.put("I", 1);
        oneWordHs.put("V", 5);
        oneWordHs.put("X", 10);
        oneWordHs.put("L", 50);
        oneWordHs.put("C", 100);
        oneWordHs.put("D", 500);
        oneWordHs.put("M", 1000);

        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                if (i != s.length() - 1) {
                    if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                        answer += 4;
                        i++;
                        continue;
                    } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                        answer += 9;
                        i++;
                        continue;
                    } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                        answer += 40;
                        i++;
                        continue;
                    } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                        answer += 90;
                        i++;
                        continue;
                    } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                        answer += 400;
                        i++;
                        continue;
                    } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                        answer += 900;
                        i++;
                        continue;
                    } else {
                        answer += oneWordHs.get(Character.toString(s.charAt(i)));
                    }
                } else {
                    answer += oneWordHs.get(Character.toString(s.charAt(i)));
                }
            } else {
                answer += oneWordHs.get(Character.toString(s.charAt(i)));
            }
        }
        
        return answer;
    }
}