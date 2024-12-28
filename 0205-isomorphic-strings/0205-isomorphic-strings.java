class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (isomorphic(s, t) && isomorphic(t, s)) {
            return true;
        }
        return false;
    }
    
    public static boolean isomorphic(String s, String t) {
        int len = s.length();
        boolean is_isomorphic = true;
        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < len; i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            if (hm.containsKey(sChar)) {
                if (hm.get(sChar) != tChar) {
                    is_isomorphic = false;
                    break;
                }
            } else {
                hm.put(sChar, tChar);
            }
        }

        return is_isomorphic;
    }
}