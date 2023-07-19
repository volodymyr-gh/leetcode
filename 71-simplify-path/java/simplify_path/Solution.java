package simplify_path;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().simplifyPath("/home/");
        assert res1.equals("/home");

        String res2 = new Solution().simplifyPath("/../");
        assert res2.equals("/");

        String res3 = new Solution().simplifyPath("/home//foo/");
        assert res3.equals("/home/foo");

        String res4 = new Solution().simplifyPath("/a//b////c/d//././/..");
        assert res4.equals("/a/b/c");
    }

    public String simplifyPath(String path) {
        Stack<String> dirs = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.pop();
                }
            } else {
                dirs.push(part);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String dir : dirs) {
            res.append('/');
            res.append(dir);
        }

        return res.isEmpty() ? "/" : res.toString();
    }
}
