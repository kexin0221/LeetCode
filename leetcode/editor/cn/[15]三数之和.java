package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                index.add(i);
            }
        }
        int firstZeroIndex = index.get(0);
        int lastZeroIndex = index.get(index.size() - 1);
        int left = 0, right = nums.length - 1;
        if ()
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
