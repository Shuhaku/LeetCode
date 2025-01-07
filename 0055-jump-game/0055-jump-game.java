class Solution {
    public boolean canJump(int[] nums) {
        int maxJumpingPos = nums[0];
        for (int pos = 1; pos < nums.length; pos++) {
            if (pos > maxJumpingPos) {
                return false;
            }
            if (pos + nums[pos] > maxJumpingPos) {
                maxJumpingPos = pos + nums[pos];
            }
        }
        return true;
    }
}