package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == val) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j+1];
                }
                len--;
            } else {
                i++;
            }
        }
        nums = Arrays.copyOf(nums, len);
        return len;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
