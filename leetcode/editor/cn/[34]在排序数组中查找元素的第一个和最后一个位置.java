package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ret[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ret[1] = i;
                break;
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
