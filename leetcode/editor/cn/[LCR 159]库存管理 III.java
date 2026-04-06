package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class SolutionLCR159 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        Arrays.sort(stock);
        return Arrays.copyOfRange(stock, 0, cnt);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
