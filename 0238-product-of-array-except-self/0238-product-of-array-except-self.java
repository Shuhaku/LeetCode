class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i];
        }

        int rightSum = 1;
        for (int rightPtr = nums.length - 1; rightPtr > 0; rightPtr--) {
            output[rightPtr] = rightSum * output[rightPtr - 1];
            rightSum *= nums[rightPtr];
        }
        output[0] = rightSum;

        return output;
    }
}