class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Pair> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (hm.containsKey(cur)) {
                Pair curPair = hm.get(cur);
                int max = curPair.max;
                int min = curPair.min;

                if (Math.abs(max - i) <= k || Math.abs(min - i) <= k) {
                    return true;
                }

                if (i < min) {
                    curPair.min = i;
                }
                if (i > max) {
                    curPair.max = i;
                }
            } else {
                hm.put(nums[i], new Pair(i));
            }
        }
        return false;
    }
}

class Pair {
    public int max;
    public int min;

    public Pair(int val) {
        this.max = val;
        this.min = val;
    }
}
