package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int d = 2 * numRows - 2, n = s.length();
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < n; i += d) ret.append(s.charAt(i));

        for(int k = 1; k < numRows - 1; k++) {
            for(int i = k, j = d - i; i < n || j < n; i += d, j += d) {
                if(i < n) ret.append(s.charAt(i));
                if(j < n) ret.append(s.charAt(j));
            }
        }

        for(int i = numRows - 1; i < n; i += d)
            ret.append(s.charAt(i));
        return ret.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
