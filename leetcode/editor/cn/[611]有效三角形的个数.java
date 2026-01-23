package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0, right = n - 1;
        int count = 0;
        while (right > 1) {
            int maxLength = nums[right];
            while (left + 1 < right) {
                for (int i = 1; i < right - left; i++) {
                    if (nums[left] + nums[left+i] > maxLength) {
                        count++;
                    }
                }
                left++;
            }
            right--;
            left = 0;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
