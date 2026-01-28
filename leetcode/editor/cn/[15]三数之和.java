package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        int i = nums.length-1;
        while (i > 1) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    List<Integer> newList = Arrays.asList(nums[left], nums[right], nums[i]);
                    if (!ret.contains(newList)) {
                        ret.add(newList);
                    }
                    left++;
                } else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            i--;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
