class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int sPtr = 0;
        for (int tPtr = 0; tPtr < t.length(); tPtr++) {
            if (t.charAt(tPtr) == s.charAt(sPtr)) {
                if (sPtr + 1 == s.length()) {
                    return true;
                }
                sPtr++;
            }
        }

        return false;
    }
}