class Solution {
    public static String simplifyPath(String path) {
        String[] tokens = path.split("/+");

        List<String> stack = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals("..")) {
                if (!stack.isEmpty()) stack.remove(stack.size() - 1);
            } else if (!token.equals(".") && !token.isEmpty()) {
                stack.add(token);
            }
        }

        return "/" + String.join("/", stack);
    }
}