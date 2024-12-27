import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int maxCnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }

            if (hm.get(nums[i]) > maxCnt) {
                max = nums[i];
                maxCnt = hm.get(nums[i]);
            }
        }
        
        return max;
    }
}