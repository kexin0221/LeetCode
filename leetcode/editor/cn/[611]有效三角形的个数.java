package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution611 {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = n - 1;
        int count = 0;
        while (i > 1) {
            int maxLength = nums[i];
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > maxLength) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
            i--;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
