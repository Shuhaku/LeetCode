class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!hm.containsKey(sortedStr)) {
                hm.put(sortedStr, new ArrayList<>());
            }
            hm.get(sortedStr).add(str);
        }

        return new ArrayList<>(hm.values());
    }

}