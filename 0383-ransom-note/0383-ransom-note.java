import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        // destruct
        for (int i = 0; i < magazine.length(); i++) {
            Character ch = magazine.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // judge
        boolean isConstruct = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);
            if (hm.containsKey(ch)) {
                if (hm.get(ch) >= 1) {
                    hm.put(ch, hm.get(ch) - 1);
                } else {
                    isConstruct = false;
                    break;
                }
            } else {
                isConstruct = false;
                break;
            }
        }

        return isConstruct;
    }
}