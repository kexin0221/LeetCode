package leetcode.editor.cn;

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution20 {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        int countLeft = 0;
        int countRight = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
                countLeft++;
            }
            if (s.charAt(i) == ')') {
                countRight++;
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                countRight++;
                if (stack.empty() || stack.pop() != '[') {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                countRight++;
                if (stack.empty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return countLeft == countRight;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
