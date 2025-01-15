import java.util.StringTokenizer;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        HashMap<String, Character> reverseHm  = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        if (pattern.length() != st.countTokens()) {
            return false;
        }

        for (int i = 0 ; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            String token = st.nextToken();

            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(token)) {
                    return false;
                }
            } else {
                hm.put(ch, token);
            }

            if (reverseHm.containsKey(token)) {
                if (!reverseHm.get(token).equals(ch)) {
                    return false;
                }
            } else {
                reverseHm.put(token, ch);
            }
        }
        return true;
    }
}