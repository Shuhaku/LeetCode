class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int dup = 0;
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (cur == nums[i]) {
                dup++;
            } else {
                nums[k] = cur;
                if (dup >= 1) {
                    nums[k + 1] = cur;
                    k += 2;
                } else {
                    k += 1;
                }
                dup = 0;
                cur = nums[i];
            }
        }
        
        nums[k] = cur;
        if (dup >= 1) {
            nums[k + 1] = cur;
            k += 2;
        } else {
            k += 1;
        }

        return k;
    }
}