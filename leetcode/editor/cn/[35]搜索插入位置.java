package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
