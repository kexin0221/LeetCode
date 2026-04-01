package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1567 {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '?') {
                for (char c = 'a'; c <= 'c'; c++) {
                    if ((i > 0 && chars[i - 1] == c) || (i < n - 1 && chars[i + 1] == c)) {
                        continue;
                    }
                    chars[i] = c;
                    break;
                }
            }
        }
        return new String(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
