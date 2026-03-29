package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
