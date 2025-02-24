class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }

        int start = nums[0]; // 시작 숫자

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) { // 연속되지 않는 경우
                if (start == nums[i - 1]) {
                    list.add(String.valueOf(start)); // 단일 숫자
                } else {
                    list.add(start + "->" + nums[i - 1]); // 범위 추가
                }
                start = nums[i]; // 새로운 범위 시작
            }
        }

        // 마지막 범위 추가
        if (start == nums[nums.length - 1]) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}