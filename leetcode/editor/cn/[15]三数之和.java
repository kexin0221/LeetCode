package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;) {
            if (nums[i] > 0) break;
            int left = i + 1, right = nums.length - 1;
            int keyNum = nums[i];
            while (left < right) {
                int leftNum = nums[left], rightNum = nums[right];
                if (leftNum + rightNum + keyNum == 0) {
                    ret.add(new ArrayList<>(Arrays.asList(leftNum, rightNum, keyNum)));
                    left++; right--;
                    // 去重：left right
                    while (left < right && nums[left - 1] == nums[left]) left++;
                    while (left < right && nums[right + 1] == nums[right]) right--;
                } else if (leftNum + rightNum + keyNum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            // 去重：i
            do i++;
            while (i < nums.length && nums[i - 1] == nums[i]);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
