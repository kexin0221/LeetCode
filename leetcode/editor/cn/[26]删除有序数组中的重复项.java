package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int len = nums.length;
        int p = 0, q = 1;
        while (q < len) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
