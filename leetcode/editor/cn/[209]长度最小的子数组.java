package leetcode.editor.cn;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length;
        if (arrSum(nums) < target) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return 1;
            for (int j = i; j < nums.length; j++) {
                int[] newArr = Arrays.copyOfRange(nums, i, j+1);
                if (arrSum(newArr) >= target && newArr.length < minLength) {
                    minLength = newArr.length;
                    break;
                }
//                if (nums[i] + nums[j] > target) {
//                    break;
//                }
            }
        }
        return minLength;
    }

    private static int arrSum (int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
