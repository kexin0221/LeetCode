package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution0101 {
    public boolean isUnique(String astr) {
        for (int i = 0; i < astr.length()-1; i++) {
            for (int j = i+1; j < astr.length(); j++) {
                if (astr.charAt(i) == astr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
