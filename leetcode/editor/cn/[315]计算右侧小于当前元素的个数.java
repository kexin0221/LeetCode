package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> retList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            retList.add(mergeNums(nums, i));
        }
        return retList;
    }

    public int mergeNums(int[] nums, int key) {
        if (key == nums.length - 1) return 0;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
