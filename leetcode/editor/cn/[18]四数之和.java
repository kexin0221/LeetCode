package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for (int j = 0; j < nums.length; ) {
            for (int i = j+1; i < nums.length;) {
                int left = i + 1, right = nums.length - 1;
                long keyNum = (long) target - nums[j] - nums[i];
                while (left < right) {
                    int leftNum = nums[left], rightNum = nums[right];
                    if (leftNum + rightNum == keyNum) {
                        ret.add(new ArrayList<>(Arrays.
                                asList(leftNum, rightNum, nums[i], nums[j])));
                        left++; right--;
                        // 去重：left right
                        while (left < right && nums[left - 1] == nums[left]) left++;
                        while (left < right && nums[right + 1] == nums[right]) right--;
                    } else if (leftNum + rightNum <= keyNum) {
                        left++;
                    } else {
                        right--;
                    }
                }
                // 去重：i
                do i++;
                while (i < nums.length && nums[i - 1] == nums[i]);
            }
            do j++;
            while (j < nums.length && nums[j - 1] == nums[j]);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
