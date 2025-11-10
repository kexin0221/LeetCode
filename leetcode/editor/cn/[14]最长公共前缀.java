package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String ret = strs[0];
        for (int i = 0; i < ret.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (ret.charAt(i) != strs[j].charAt(i)) {
                    ret = ret.substring(0, i);
                    break;
                }
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
