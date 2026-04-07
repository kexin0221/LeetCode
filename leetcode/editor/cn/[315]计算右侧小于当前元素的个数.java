package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution315 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> retList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int[] tmp = Arrays.copyOfRange(nums,i+1, nums.length);
            Arrays.sort(tmp);
            int j = tmp.length-1;
            while (j >= 0) {
                if (tmp[j] < nums[i]) {
                    count = j+1;
                    break;
                }
                j--;
            }
            retList.add(count);
        }
        return retList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
