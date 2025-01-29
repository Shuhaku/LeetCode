import java.util.StringTokenizer;

class Solution {
    public static String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            words.add(st.nextToken());
        }

        Collections.reverse(words);
        return String.join(" ", words);
    }
}