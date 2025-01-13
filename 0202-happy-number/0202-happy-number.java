class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> hm =  new HashMap<>();
        hm.put(n, true);
        int cur = n;

        while(true) {
            int next = 0;
            while (cur > 0) {
                int digit = cur % 10;
                next += digit * digit;
                cur /= 10;
            }

            if (next == 1) {
                return true;
            }
            if (hm.containsKey(next)) {
                return false;
            }
            hm.put(next, true);
            cur = next;
        }
    }
}