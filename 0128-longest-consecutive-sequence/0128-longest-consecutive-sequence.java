class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSeq = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longestSeq = Math.max(longestSeq, count);
            }
        }

        return longestSeq;
    }
}