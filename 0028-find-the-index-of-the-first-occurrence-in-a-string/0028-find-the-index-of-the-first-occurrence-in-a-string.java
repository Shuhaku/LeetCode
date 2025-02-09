class Solution {
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        char needleFirst = needle.charAt(0);

        for (int i = 0; i < haystackLen; i++) {
            if (haystack.charAt(i) == needleFirst && (i + needleLen - 1 < haystackLen)) {
                if (haystack.substring(i, i + needleLen).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}