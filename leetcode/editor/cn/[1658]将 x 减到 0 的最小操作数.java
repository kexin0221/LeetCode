package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;
        if (target < 0) return -1;
        if (target == 0) return nums.length;
        int maxLength = -1, left = 0, currentSum = 0;
        for (int right = 0; right < nums.length; right++) {
                currentSum += nums[right];
            while (currentSum > target && left <= right) {
                currentSum -= nums[left++];
            }
            if (currentSum == target){
                int newLength = right - left + 1;
                maxLength = Math.max(maxLength, newLength);
            }
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
