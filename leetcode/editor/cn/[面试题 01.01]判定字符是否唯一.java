package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution0101 {
    public boolean isUnique(String astr) {
        // 鸽巢原理
        if (astr.length() > 26) return false;
        // 位图
        int bitMap = 0;
        for (int i = 0; i < astr.length(); i++) {
            int x = astr.charAt(i) - 'a';
            // 位图中元素已经存在
            if (((bitMap >> x) & 1) == 1) return false;
            // 将当前字符加入到位图中
            bitMap |= 1 << x;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
