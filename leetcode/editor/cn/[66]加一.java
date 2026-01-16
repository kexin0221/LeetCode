package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution66 {
    public int[] plusOne(int[] digits) {
        String string = Arrays.toString(digits);
        int num = Integer.getInteger(string) + 1;
        String newStr = String.valueOf(num);
        int[] ret = new int[newStr.length()];
        for (int i = 0; i < newStr.length(); i++) {
            ret[i] = Character.getNumericValue(newStr.charAt(i));
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
