class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (cur == nums[i]) {
                continue;
            } else {
                cur = nums[i];
                nums[k] = cur;
                k++;
            }
        }

        return k;
    }
}