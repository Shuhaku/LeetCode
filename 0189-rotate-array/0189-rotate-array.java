class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        if (end < 0) {
            return;
        }
        int frontEnd = (start + end) / 2;
        for (int i = start; i <= frontEnd; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
        }
    }
}